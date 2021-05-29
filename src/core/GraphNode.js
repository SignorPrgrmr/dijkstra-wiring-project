import GraphEdge from "./GraphEdge";

export default class GraphNode {

    edges
    name
    type
    constructor(name , type) {
        this.name = name
        this.type = type
        this.edges = []
    }
    adjacentNodes(){
        const adjacents = []
        for (const edge of this.edges){
            adjacents.push(edge.getAdjacent(this))
        }
        return adjacents
    }
    addAdjacent(adjacent , cost){
        const edge = new GraphEdge(this , adjacent , cost)
        this.edges.push(edge)
    }
    // removeAdjacent(adjacent){
    //
    // }
    // removeEdge(edge){
    //
    // }
    // remove(){
    //
    // }
}
