package com.hugs4bugs.simkeshi.core;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {

    /**
     * tohidjan
     * bu ike brda gorusan hmn bu gereha vasl olan yallar mahsub olur
     */
    private final List<GraphEdge> edges;

    private final String name;
    private final GraphNodeType type;

    /**
     * Ela xas bishey dare
     */
    public GraphNode(String name, GraphNodeType type) {
        edges = new LinkedList<>();
        this.name = name;
        this.type = type;
    }

    /**
     * getter de bawm xas bishey dare
     * @return
     */
    public List<GraphEdge> getEdges() {
        return edges;
    }

    /**
     * Getter de xas bishey dar.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Getter de gina
     * @return
     */
    public GraphNodeType getType() {
        return type;
    }

    /**
     * janivi yiyim tohid
     * bu method node'n hamsayalarin geytarajax
     * dar hagigat yani har node'i ke bidana yal'nn buna vasl olur hamsaye mahsub olar
     * @return hamsayalari
     */
    public List<GraphNode> adjacentNodes() {
        List<GraphNode> adjacents = new LinkedList<>();
        for (GraphEdge edge : edges)
            adjacents.add(edge.getAdjacent(this));
        return adjacents;
    }

    /**
     * bu method'nn eliya bulasan bidana node'e hamsaye bu node'a izafa eliyasan
     * serfan jahate ettela diyim ke ozum bunn ichinda har iki node'n hmn yalin ichinda olmaghin nazarda almisham
     * ona gora niyaz dare har iki node'da bune charasan fgt 1seri charsan gorar
     * @param adjacent
     * @param cost
     */
    public boolean addAdjacent(GraphNode adjacent, int cost) {
        if (adjacentNodes().contains(adjacent)) {
            return false;
        }
        GraphEdge newEdge = new GraphEdge(this, adjacent, cost);
        edges.add(newEdge);
        adjacent.getEdges().add(newEdge);
        return true;
    }

    /**
     * Bir haji etdi sifaresh balasi mash tohida
     * bu method hamsayani silmaxdan oturde ke silinsa aya true geytarajax
     * dar gheyre in surat false
     * @param adjacent
     * @return
     */
    public boolean removeAdjacent(GraphNode adjacent) {
        if (!adjacentNodes().contains(adjacent)) {
            return false;
        }
        GraphEdge target = null;
        for (GraphEdge edge : edges) {
            if (edge.getAdjacent(this) == adjacent) {
                target = edge;
            }
        }
        if (target == null) {
            return false;
        }
        return edges.remove(target);
    }

    /**
     * bu method serfan bidana edge'e remove elar dar surate vojud
     * @param edge
     * @return
     */
    public boolean removeEdge(GraphEdge edge) {
        return edges.remove(edge) && edge.getAdjacent(this).getEdges().remove(edge);
    }

    public boolean remove() {
        boolean isRemoved = true;
        for (GraphEdge edge : edges) {
            isRemoved = isRemoved && removeEdge(edge);
        }
        return isRemoved;
    }
}
