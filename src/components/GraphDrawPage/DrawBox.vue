<template>
  <div id="box-container">
    <div id="draw-box" v-on:mousemove="updateXY" @click="Draw">
      <svg id="wire-box">
        <line v-for="Wire in wires" :key='Wire.key' :x1="Wire.x1" :x2="Wire.x2" :y1="Wire.y1" :y2="Wire.y2" :style="Wire.wireStyle" @click="deleteWire(Wire.key)"><title>cost = {{ Wire.wireCost }}</title></line>
      </svg>
      <graph-node v-for="Node in Nodes" :key="Node.text" :x="Node.x" :y="Node.y" :text="Node.text" :class="Node.mode" @click="select(Node.text , Node.x ,Node.y)"></graph-node>
      <graph-cursor-node v-bind:class="node" ref="CursorNode"></graph-cursor-node>
    </div>
  </div>
</template>

<script>
import GraphCursorNode from "@/components/GraphDrawPage/GraphCursorNode";
import GraphNode from "@/components/GraphDrawPage/GraphNode";
import { mapGetters } from 'vuex'

export default {
  name: 'DrawBox',
  computed:{
    ...mapGetters(['getServerUrl'])
  },
  components: {GraphCursorNode, GraphNode},
  data(){
    return{
      key : 0,
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
      this.key = 0
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
      this.wire = []
      this.text = ''
    },
    select(txt , x , y){
      if (this.wire.length == 1){
        this.node = 'wire'
      }
      if(this.node == 'wire'){
        const wireNode = {
          text : txt,
          x : x,
          y :y
        }
        this.wire.push(wireNode)
        if(this.wire.length == 2) {
          if (this.wire[0].text == this.wire[1].text){
            alert('Can not set wire between one node and itself')
            this.wire = []
          }
          else {
            const cost = prompt("Please enter cost(if you wanna cancel darwing wire just leave it empty)");
            if (cost == null || cost == "") {
              this.wire = {}
            } else {
              const newWire = {
                first: this.wire[0].text,
                second: this.wire[1].text,
                x1: Number(this.wire[0].x)+12.5,
                y1: Number(this.wire[0].y)+12.5,
                x2: Number(this.wire[1].x)+12.5,
                y2: Number(this.wire[1].y)+12.5,
                wireCost: Number(cost),
                wireStyle : "stroke:rgb(0,0,0);stroke-width:4",
                key :this.key
              }
              this.key++
              this.wires.push(newWire)
              this.wire = []
            }
          }
        }
      }
      else if (this.node == 'delete-node'){
        for(let i = 0 ; i < this.Nodes.length ; i++){
          if (this.Nodes[i].text == txt){
            this.Nodes[i] = this.Nodes[this.Nodes.length-1]
            this.Nodes.pop()
            if (txt == "P"){
              this.p = 0
            }
            break
          }
        }
        for (let i = 0 ; i < this.wires.length ; i++){
          if (this.wires[i].first == txt || this.wires[i].second == txt){
            this.wires[i] = this.wires[this.wires.length-1]
            this.wires.pop()
            i--
          }
        }
      }
    },
    deleteWire(key){
      if (this.node == 'delete-wire'){
        for(let i = 0 ; i < this.wires.length ; i++){
          if (this.wires[i].key == key){
            this.wires[i] = this.wires[this.wires.length-1]
            this.wires.pop()
            this.node = ''
            break
          }
        }
      }
    },
    sendGraph(){
      const sendingNodes = []
      const sendingEdges = []
      for (const Node of this.Nodes){
        sendingNodes.push(Node.text)
      }
      for (const Wire of this.wires){
        const newEdge = {
          firstNode : Wire.first,
          secondNode : Wire.second,
          cost : Wire.wireCost
        }
        sendingEdges.push(newEdge)
      }
        //test field
        // const previewObj = {
        //   nodes : this.Nodes,
        //   wires : this.wires,
        //   selectedWires : sendingEdges.slice(2 , 5)
        // }
        // this.$emit('makeGraph' , previewObj)
      let formData = new FormData()
      formData.append('nodes' , JSON.stringify(sendingNodes))
      formData.append('edges' , JSON.stringify(sendingEdges))
      fetch(this.getServerUrl + "/api/graph", {
        method: "POST",
        body: formData
      }).then(response =>{
        if (response.ok){
          return response.json()
        }
      }).then(json => {
        const previewObj = {
          nodes : this.Nodes,
          wires : this.wires,
          selectedWires : json
        }
        this.$emit('makeGraph' , previewObj)
      })
    },
    makeWiresBlack(){
      for (let i = 0 ; i < this.wires.length ; i++){
        this.wires[i].wireStyle = "stroke:rgb(0,0,0);stroke-width:4"
      }
    },
    Draw(){
      if (this.node.charAt(0) == 'w' || this.node.charAt(0) == 'd'){
        console.log("I'm not suppose to do anything")
      }
      else{
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
            this.x = 0
            this.y = 0
          }
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
  }
}

</style>
