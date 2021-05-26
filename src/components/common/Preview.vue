<template>
  <div id="preview-container">
    <label id="close-preview">&#x2715;</label>
    <div id="preview-content">
      <div>
        <graph-node class="node-power-source"></graph-node>
      </div>
<!--      <graph-node class="node-switch"></graph-node>-->
    </div>
    <button id="save-graph">Save Image</button>
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
  padding: 16px 32px;

  display: flex;
  flex-flow: column nowrap;
  align-items: flex-end;
  justify-content: stretch;

  #close-preview {
    width: 20px;
    height: 20px;
    border: none;
    border-radius: 50%;
    background: black;
    color: white;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 8pt;
  }
  #close-preview:hover {
    background: red;
    cursor: pointer;
  }

  #preview-content {
    width: 100%;
    height: 80%;
    border: solid 1px;
    align-self: flex-start;
    margin: 8px 0;
  }

  #save-graph {
    width: 100px;
    height: 40px;
  }
}
</style>
