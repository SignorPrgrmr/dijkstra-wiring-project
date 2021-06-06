export default class GraphEdge {

    firstNode
    secondNode
    cost
    constructor(first , second , cost) {
        this.firstNode = first
        this.secondNode = second
        this.cost = cost
    }
    getAdjacent(node){
        return this.firstNode === node ? this.secondNode : this.secondNode === node ? this.firstNode : null
    }


}
