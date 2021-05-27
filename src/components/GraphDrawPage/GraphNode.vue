<template>
  <div class="node-container" v-bind:style="position" >
    <label class="node-name" >{{ text }}</label>
  </div>
</template>

<script>
export default {
  name: "GraphNode",
  data(){
    return{
      text : "",
      position : 'left:0px,top:0px'
    }
  },
  methods:{
    set(x,y,txt){
      this.position = `left:${x}px;top:${y}px`
      this.text = txt
      console.log(this.position)
    }
  }
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
  position: relative;
  //left: 100%; //determines the position of the Node on the parent div.
  //top: 100%; //determines the position of the Node on the parent div.

  .node-name {
    width: 100%;
    height: 100%;
    margin: 0;
    padding: 0;
    background: transparent;
    color: white;
    font-size: 8pt;
    display: flex;
    justify-content: center;
    align-items: center;
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