<template>
  <div id="box-container">
    <div id="draw-box" v-on:mousemove="updateXY" @click="Draw">
<!--      Nodes will be drawn here!-->
      <graph-node v-bind:class="cursorNode" ref="graph"></graph-node>
    </div>
  </div>
</template>

<script>
import GraphNode from "@/components/GraphDrawPage/GraphNode";
export default {
  name: 'DrawBox',
  components: {GraphNode},
  data(){
    return{
      x : 0,
      y : 0,
      p : 1,
      c : 1,
      s : 1,
      text : "",
      node : '',
      cursorNode : ''
    }
  },
  methods:{
    DeleteGraph(){
      // delete graph
    },
    updateXY(event){
      this.x = event.offsetX
      this.y = event.offsetY
      this.$refs.graph.set(this.x,this.y,this.text)
    },
    ChangeNode(mode){
      this.node = mode
      this.cursorNode = `${this.node} node-preview`
    },
    Draw(){
      // console.log(this.nodeType)
      // const element = document.createElement('graph-node')
      // element.setAttribute('class', this.node)
      // document.getElementById('draw-box').appendChild(element)
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
  }
}

</style>
