<template>
  <div id="box-container">
    <div id="draw-box" v-on:mousemove="updateXY" @click="Draw">
      <svg id="wire-box"> <!-- this will contain wires -->

      </svg>
      <div id="node-box" > <!-- this will contain nodes -->
        <graph-node v-for="Node in Nodes" :key="Node.text" :x="Node.x" :y="Node.y" :text="Node.text" :class="Node.mode" @click="select(Node.text , Node.x ,Node.y)"></graph-node>
        <graph-cursor-node v-bind:class="node" ref="CursorNode"></graph-cursor-node>
      </div>
    </div>
  </div>
</template>

<script>
import GraphCursorNode from "@/components/GraphDrawPage/GraphCursorNode";
import GraphNode from "@/components/GraphDrawPage/GraphNode";

export default {
  name: 'DrawBox',
  components: {GraphCursorNode, GraphNode},
  data(){
    return{
      x : 0,
      y : 0,
      p : 0,
      j : 1,
      s : 1,
      text : "",
      node : '',
      Nodes : [],
      wire : [],
      wires : []
    }
  },
  methods:{
    DeleteGraph(){
      this.x = 0
      this.y = 0
      this.p = 0,
      this.j = 1,
      this.s = 1,
      this.text = "",
      this.node = '',
      this.Nodes = [],
      this.wire = [],
      this.wires = []
    },
    updateXY(event){
      this.x = event.offsetX
      this.y = event.offsetY
      this.$refs.CursorNode.set(this.x,this.y)
    },
    ChangeNode(mode){
      this.node = mode
    },
    select(txt , x , y){
      if(this.node == 'wire'){
        const wireNode = {
          text : txt,
          x : x,
          y :y
        }
        this.wire.push(wireNode)
        if(this.wire.length == 2) {
          const cost = prompt("Please enter cost(if you wanna cancel darwing wire just leave it empty)");
          if (cost == null || cost == "") {
            this.wire = {}
            this.node = ''
          } else {
            //  draw line
            const newWire = {
              first: this.wire[0].text,
              second: this.wire[1].text,
              x1: this.wire[0].x,
              y1: this.wire[0].y,
              x2: this.wire[1].x,
              y2: this.wire[1].y,
              wireCost: Number(cost)
            }
            this.wires.push(newWire)
            this.wire = {}
            this.node = ''
          }
        }
      }
    },
    sendGraph(){
      const sendingNodes = []
      const sendingEdges = []
      const sendArray = [sendingNodes , sendingEdges]
      for (const Node of this.Nodes){
        sendingNodes.push(Node.text)
      }
      for (const Wire of this.wires){
        const newEdge = {
          firstNode : Wire.first,
          secondNode : Wire.second,
          cost : Wire.cost
        }
        sendingEdges.push(newEdge)
      }
      fetch(this.getServerUrl + "/api/graph", {
        method: "POST",
        body: JSON.stringify(sendArray)
      }).then(response =>{
        if (response.ok){
          const Edges = response.json()
          console.log(Edges)
          // draw graph
        }
      })
    },
    Draw(){
      if (this.node.charAt(5) == 'p' && this.p == 1){
        alert('cannot add more than one Power Source')
      }
      else{
        if(this.node != ""){
          if(this.node.charAt(5) == 'p'){
            this.text = `P`
            this.p++
          }
          else if(this.node.charAt(5) == 'j'){
            this.text = `J${this.j}`
            this.j++
          }
          else{
            this.text = `S${this.s}`
            this.s++
          }
          let newNode = {text : this.text, x : this.x , y : this.y , mode : this.node}
          this.Nodes.push(newNode)
          this.node = ""
          this.x = 0
          this.y = 0
        }
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
@import "./../../../public/-variables";
#box-container {
  grid-area: drawbox;
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row nowrap;
  justify-content: center;
  align-items: center;

  #draw-box {
    border: none;
    width: 98%;
    height: 98%;
    overflow: auto;
    box-shadow: 0 0 10px 3px rgba(0,0,0,0.2);
    border-radius: 8px;
    position: relative;

    #wire-box {
      @include draw-box;
    }
    #node-box {
      @include draw-box;
    }
  }
}

</style>
