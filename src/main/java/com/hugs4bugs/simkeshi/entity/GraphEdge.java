package com.hugs4bugs.simkeshi.entity;

public class GraphEdge {

    private final GraphNode firstNode;
    private final GraphNode secondNode;
    private final int cost;

    public GraphEdge(GraphNode firstNode, GraphNode secondNode, int cost) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.cost = cost;
    }

    public GraphNode getFirstNode() {
        return firstNode;
    }

    public GraphNode getSecondNode() {
        return secondNode;
    }

    public int getCost() {
        return cost;
    }

    public GraphNode getAdjacent(GraphNode node) {
        return node == firstNode ? secondNode : firstNode;
    }
}
