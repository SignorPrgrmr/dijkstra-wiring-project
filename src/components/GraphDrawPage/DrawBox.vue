<template>
  <div id="box-container">
    <div id="draw-box" v-on:mousemove="updateXY" @click="Draw">
      <!-- this div will contain wires, and the one inside this will have nodes -->
      so, this has wires in it.
      <div id="node-box">
        and this one has nodes in it.
        <graph-node v-for="Node in Nodes" :key="Node.text" :x="Node.x" :y="Node.y" :text="Node.text" :class="Node.mode"></graph-node>
        <graph-cursor-node v-bind:class="node" ref="CursorNode"></graph-cursor-node>
      </div>


<!--      <graph-node v-for="Node in Nodes" :key="Node.text" :x="Node.x" :y="Node.y" :text="Node.text" :class="Node.mode"></graph-node>-->
<!--      <graph-cursor-node v-bind:class="node" ref="CursorNode"></graph-cursor-node>-->
    </div>
  </div>
</template>

<script>
import GraphNode from "@/components/GraphDrawPage/GraphNode";
import GraphCursorNode from "@/components/GraphDrawPage/GraphCursorNode";
export default {
  name: 'DrawBox',
  components: {GraphCursorNode, GraphNode},
  data(){
    return{
      x : 0,
      y : 0,
      p : 1,
      j : 1,
      s : 1,
      text : "",
      node : '',
      Nodes : []
    }
  },
  methods:{
    DeleteGraph(){
      // delete graph
    },
    updateXY(event){
      this.x = event.offsetX
      this.y = event.offsetY
      this.$refs.CursorNode.set(this.x,this.y)
    },
    ChangeNode(mode){
      this.node = mode
    },
    Draw(){
      if(this.node != ""){
        if(this.node.charAt(5) == 'p'){
          this.text = `P${this.p}`
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
        const newNode = {text : this.text, x : this.x , y : this.y , mode : this.node}
        this.node = ""
        this.x = 0
        this.y = 0
        this.Nodes.push(newNode)
      }

    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
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

    #node-box {
      width: 100%;
      height: 100%;
      background: transparent;
      border: 1px solid red;
      position: absolute;
      top: 0;
      left: 0;
    }
  }
}

</style>
