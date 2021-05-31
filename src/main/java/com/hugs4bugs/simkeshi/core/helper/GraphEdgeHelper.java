package com.hugs4bugs.simkeshi.core.helper;

public class GraphEdgeHelper {

    private String firstNode;
    private String secondNode;
    private int cost;

    public String getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(String firstNode) {
        this.firstNode = firstNode;
    }

    public String getSecondNode() {
        return secondNode;
    }

    public void setSecondNode(String secondNode) {
        this.secondNode = secondNode;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "GraphEdgeHelper{" +
                "firstNode='" + firstNode + '\'' +
                ", secondNode='" + secondNode + '\'' +
                ", cost=" + cost +
                '}';
    }
}
