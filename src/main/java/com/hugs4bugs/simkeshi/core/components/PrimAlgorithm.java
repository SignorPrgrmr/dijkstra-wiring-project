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
        List<GraphNode> nodes = primAlgorithm(head);
        boolean isOptimized = false;
        while (!isOptimized) {
            isOptimized = optimize(nodes);
        }
        return head;
    }

    private List<GraphNode> primAlgorithm(GraphNode head) {
        Set<GraphNode> nodes = new HashSet<>();
        nodes.add(head);
        System.out.println("Added " + head);
        PriorityQueue<GraphEdge> edgesUnderOperation = new PriorityQueue<>();
        boolean flag = true;
        GraphNode pointer = head;
        while (flag) {
            for (GraphEdge edge : pointer.getEdges()) {
                if (!nodes.contains(edge.getAdjacent(pointer))) {
                    edgesUnderOperation.add(edge);
                }
            }
            GraphEdge minimum = edgesUnderOperation.poll();
            if (nodes.contains(minimum.getFirstNode()))
                pointer = minimum.getSecondNode();
            else
                pointer = minimum.getFirstNode();
            nodes.add(pointer);
            System.out.println("Added " + pointer + " via " + minimum);
            edgesUnderOperation.removeIf(graphEdge -> {
                if (nodes.contains(graphEdge.getFirstNode()) && nodes.contains(graphEdge.getSecondNode())) {
                    graphEdge.getFirstNode().getEdges().remove(graphEdge);
                    graphEdge.getSecondNode().getEdges().remove(graphEdge);
                    System.out.println("Removed " + graphEdge);
                    return true;
                }
                return false;
            });
            flag = !edgesUnderOperation.isEmpty();
        }
        return new ArrayList<>(nodes);
    }

    private boolean optimize(List<GraphNode> nodes) {
        boolean isOptimized = true;
        List<GraphNode> badNodes = new LinkedList<>();
        for (GraphNode node : nodes) {
            if (node.getType() == GraphNodeType.JUNCTION_BOX && node.getEdges().size() < 2) {
                node.remove();
                isOptimized = false;
                badNodes.add(node);
            }
        }
        nodes.removeAll(badNodes);
        return isOptimized;
    }
}
