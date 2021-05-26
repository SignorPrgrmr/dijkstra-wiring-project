<template>
  <div class="node-container">
    <label class="node-name">S1</label>
  </div>
</template>

<script>
export default {
  name: "GraphNode"
}
</script>

<style scoped lang="scss">
@import "./../../../public/-variables";

.node-container {
  width: 25px;
  height: 25px;
  border: none;
  border-radius: 50%;
  margin: 0;
  padding: 0;
  position: absolute;
  left: 100px; //determines the position of the Node on the parent div.
  top: 100px; //determines the position of the Node on the parent div.

  .node-name {
    width: 100%;
    height: 100%;
    margin: 0;
    padding: 0;
    background: transparent;
    color: white;
    font-size: 8pt;
  }
}

.node-power-source {
  background: $color-power-source;
}

.node-junction-box {
  background: $color-junction-box;
}

.node-switch {
  background: $color-switch;
}

.node-preview {
  opacity: 50%;
}
</style>