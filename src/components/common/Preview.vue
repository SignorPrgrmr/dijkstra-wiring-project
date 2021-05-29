<template>
  <div id="preview-container">
    <label id="close-preview">&#x2715;</label>

    <div id="graph-content"> <!-- this div will contain wires -->
      some wires here let's imagine.
      <div id="preview-nodes"> <!-- this div will have nodes in it -->
        <graph-node class="node-power-source"></graph-node>
      </div>
    </div>

    <div id="image-content"> <!-- this div will have image, and will toggle with "graph-content" -->
      this div has our image
    </div>

    <div id="preview-buttons">
      <button id="toggle-preview">View Photo</button>
      <button id="save-graph">Save Image</button>
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
@import "./../../../public/-variables";

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
    background: #3b3b3b;
    cursor: pointer;
  }

  #graph-content {
    display: block; // toggle none and block

    @include preview-box;

    #preview-nodes {
      width: 100%;
      height: 100%;
      position: absolute;
      top: 0;
      left: 0;
      //border: 1px solid red;
    }
  }

  #image-content {
    display: none; // toggle block and none;

    @include preview-box;
  }

  #save-graph,
  #toggle-preview {
    @include preview-button;
    margin-left: 8px;
  }
  #save-graph:hover,
  #toggle-preview:hover {
    cursor: pointer;
    background: lighten($color-button,10%);
  }
}
</style>
