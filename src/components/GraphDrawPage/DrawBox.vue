<template>
  <div id="box-container">
    <div id="draw-box">
      Nodes will be drawn here!
      <graph-node class="node-switch"></graph-node>
    </div>
  </div>
</template>

<script>
import GraphNode from "@/components/GraphDrawPage/GraphNode";
export default {
  name: 'DrawBox',
  components: {GraphNode},
  methods:{
    DeleteGraph(){
      // delete graph
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
    width: 80%;
    height: 80%;
    overflow: auto;
    box-shadow: 0 0 10px 3px rgba(0,0,0,0.2);
    border-radius: 8px;
  }
}

</style>
