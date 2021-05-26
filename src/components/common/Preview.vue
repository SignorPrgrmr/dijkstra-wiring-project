<template>
  <div id="preview-container">
    <div id="preview-content">
      <graph-node class="node-switch node-preview"></graph-node>
    </div>
  </div>
</template>

<script>
import GraphNode from "@/components/GraphDrawPage/GraphNode";
export default {
  name: 'Preview',
  components: {GraphNode},
  methods:{
    DrawGraph(graph){
      //drawGraph
      console.log(graph)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

#preview-container {
  width: 80%;
  height: 80%;
  position: fixed;
  top: 10%;
  left: 10%;
  z-index: 3;
  background: #ffffff;
  border-radius: 20px;

  #preview-content {
    width: 90%;
    height: 90%;
    border: solid 1px;
  }
}
</style>
