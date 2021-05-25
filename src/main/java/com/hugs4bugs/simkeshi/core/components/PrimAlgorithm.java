package com.hugs4bugs.simkeshi.core.components;

import com.hugs4bugs.simkeshi.core.GraphEdge;
import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.GraphNodeType;
import com.sun.source.tree.Tree;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PrimAlgorithm {

    public GraphNode findTheOptimumSolution(GraphNode head) {
        // using this pointer to travel inside the graph
        GraphNode pointer = head;
        // this is the set we're going to use to find which nodes are traveled
        Set<GraphNode> nodes = new HashSet<>();
        // We're going to use this set to find the edges of MCST.
        Set<GraphEdge> selectedEdges = new HashSet<>();
        // We're going to use this TreeSet to sort the edges by their cost so we can choose the minimum in every step.
        TreeSet<GraphEdge> edges = new TreeSet<>();
        // pointer is not going to be null unless it travels all of the nodes.
        while (pointer != null) {
            // after adding the pointer we have to delete all of the unselected edges between selected nodes
            // because we're not going to need them.
            nodes.add(pointer);
            edges.removeIf(edge -> nodes.contains(edge.getFirstNode()) && nodes.contains(edge.getSecondNode()));
            // in this loop we're going to add all the new edges that comes with pointer
            // unless the adjacent node is selected before.
            for (GraphEdge edge : pointer.getEdges()) {
                if (!nodes.contains(edge.getAdjacent(pointer))) {
                    edges.add(edge);
                }
            }
            // Polling first of TreeSet returns the minimum.
            // I'm 100% sure that this new edge is between a selected node and a new node or it's null (if set is empty)
            GraphEdge minEdge = edges.pollFirst();
            // if it's null so the set is empty and we have found all the edges we need for MCST.
            if (minEdge != null) {
                selectedEdges.add(minEdge);
                pointer = minEdge.getAdjacent(pointer);
            } else {
                pointer = null;
            }
        }
        // after finding the needed edges for MCST, inside this loop I'm removing the extra edges from graph.
        for (GraphNode node : nodes) {
            for (GraphEdge edge : node.getEdges()) {
                if (!selectedEdges.contains(edge)) {
                    // just for debugging
                    if (!node.removeEdge(edge)) {
                        System.out.println("bir mushkul var");
                    }
                }
            }
        }
        // Now our graph is MCST. We just need to remove the extra junction boxes.
        boolean isOptimized = true;
        while (isOptimized) {
            isOptimized = optimize(nodes);
        }
        return head;
    }

    private boolean optimize(Set<GraphNode> nodes) {
        boolean isOptimized = true;
        for (GraphNode node : nodes) {
            if (node.getType() == GraphNodeType.JUNCTION_BOX && node.getEdges().size() < 2) {
                node.remove();
                isOptimized = false;
            }
        }
        return isOptimized;
    }
}
