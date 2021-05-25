<template>
  <div id="toolbar-container">
    <button class="toolbar-button">Power Source</button>
    <button class="toolbar-button">Junction Box</button>
    <button class="toolbar-button">Switch</button>
    <button class="toolbar-button">Wire</button>
  </div>
</template>

<script>
export default {
  name: 'ToolBar',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
#toolbar-container {
  grid-area: toolbar;

  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: column;

  .toolbar-button {
    height: 80px;
  }
}
</style>
