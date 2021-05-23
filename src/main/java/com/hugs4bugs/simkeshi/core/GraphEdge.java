package com.hugs4bugs.simkeshi.core;

public class GraphEdge {

    private final GraphNode firstNode;
    private final GraphNode secondNode;
    private final int cost;

    /**
     * Ela xas bishey dar
     * @param firstNode
     * @param secondNode
     * @param cost
     */
    public GraphEdge(GraphNode firstNode, GraphNode secondNode, int cost) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.cost = cost;
    }

    /**
     * Getter de
     * @return
     */
    public GraphNode getFirstNode() {
        return firstNode;
    }

    /**
     * Getter de
     * @return
     */
    public GraphNode getSecondNode() {
        return secondNode;
    }

    /**
     * Getter de
     * @return
     */
    public int getCost() {
        return cost;
    }

    /**
     * Bu da bir jaleb method de ke fgt fikr eliram oz dardima dayajax sizlar ishlatmiyajaxsiz
     * gina da tozih verim
     * dar hagigat bulurux ke har yal dana node'e bir birina vasl elar
     * bu method bu darda dayir ke bidan node alsin
     * va check elasin gorsun aya bu yalin ustunda o node olsa node'e mogabelin return elasin
     * dar gheyre in surat null geytarsin
     * @param node
     * @return node'e mgabele dar surate inke node jozvi az bu graph ola. dar gheyre in surat null
     */
    public GraphNode getAdjacent(GraphNode node) {
        return node == firstNode ? secondNode : node == secondNode ? firstNode : null;
    }
}
