package com.example.electricproject.Classes;

import java.util.*;

public class DijkstraAlgorithm {

    public GraphNode findTheOptimumSolution(GraphNode head, int size) {
        List<GraphNode> nodes = dijkstraAlgorithm(head, size);
        boolean isOptimized = false;
        while (!isOptimized) {
            isOptimized = optimize(nodes);
        }
        return head;
    }
    private List<GraphNode> dijkstraAlgorithm(GraphNode head, int size) {
        Set<GraphNode> nodes = new HashSet<>();
        Map<GraphNode, Integer> costs = new HashMap<>();
        Map<GraphNode, GraphNode> paths = new HashMap<>();
        GraphNode pointer = head;
        costs.put(head, 0);
        paths.put(head, head);
        while (nodes.size() < size) {
            nodes.add(pointer);
            System.out.printf("Node'e %s be S ezafe shod%n", pointer);
            for (GraphEdge edge : pointer.getEdges()) {
                if (paths.containsKey(edge.getAdjacent(pointer))) {
                    int cost = costs.get(pointer) + edge.getCost();
                    if (cost < costs.get(edge.getAdjacent(pointer))) {
                        costs.put(edge.getAdjacent(pointer), cost);
                        paths.put(edge.getAdjacent(pointer), pointer);
                        System.out.printf("Node'e %s ba hazineye %s dar paths ba vorud az %s va costs update shod%n",
                                edge.getAdjacent(pointer), cost, pointer);
                    }
                } else {
                    int cost = costs.get(pointer) + edge.getCost();
                    costs.put(edge.getAdjacent(pointer), cost);
                    paths.put(edge.getAdjacent(pointer), pointer);
                    System.out.printf("Node'e %s ba hazineye %s dar path ba vorud az %s va be costs ezafe shod%n",
                            edge.getAdjacent(pointer), cost, pointer);
                }
            }
            pointer = getMinimum(costs, nodes);
        }
        List<GraphEdge> selectedEdges = new LinkedList<>();
        for (GraphNode node : paths.keySet()) {
            for (GraphEdge edge : node.getEdges()) {
                if (edge.getAdjacent(node) == paths.get(node)) {
                    selectedEdges.add(edge);
                }
            }
        }
        System.out.println(selectedEdges);
        for (GraphNode node : nodes) {
            List<GraphEdge> removableEdges = new LinkedList<>();
            for (GraphEdge edge : node.getEdges()) {
                if (!selectedEdges.contains(edge)) {
                    removableEdges.add(edge);
                }
            }
            node.getEdges().removeAll(removableEdges);
        }
        return new ArrayList<>(nodes);
    }

    private GraphNode getMinimum(Map<GraphNode, Integer> costs, Set<GraphNode> nodes) {
        int minimum = Integer.MAX_VALUE;
        GraphNode selected = null;
        for (GraphNode node : costs.keySet()) {
            if (!nodes.contains(node)) {
                if (costs.get(node) < minimum) {
                    minimum = costs.get(node);
                    selected = node;
                }
            }
        }
        return selected;
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
