<template>
  <div id="toolbar-container">
    <button class="toolbar-button" @click="changeNode('node-power-source')">Power Source</button>
    <button class="toolbar-button" @click="changeNode('node-junction-box')">Junction Box</button>
    <button class="toolbar-button" @click="changeNode('node-switch')">Switch</button>
    <button class="toolbar-button">Wire</button>
  </div>
</template>

<script>
export default {
  name: 'ToolBar',
  methods:{
    changeNode(mode){
      this.$emit('ChangeNode' , mode)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
@import "./../../../public/-variables";
#toolbar-container {
  grid-area: toolbar;

  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: column;
  background: $color-toolbar;


  .toolbar-button {
    height: 80px;
    width: 100%;
    margin: 0;
    background: $color-toolbar;
    border: none;
    border-radius: 0;
    font-size: 12pt;
    text-align: left;
    padding-left: 16px;
  }
  .toolbar-button:hover {
    background: darken($color-toolbar,10%);
  }
}
</style>
