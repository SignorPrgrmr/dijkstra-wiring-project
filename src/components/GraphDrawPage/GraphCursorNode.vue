<template>
  <div class="node-container" v-bind:style="position" >
  </div>
</template>

<script>
export default {
  name: "GraphCursorNode",
  data(){
    return{
      position : ''
    }
  },
  methods:{
    set(x,y){
      this.position = `left:${x}px;top:${y}px`
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

}

.node-power-source {
  background: $color-power-source;
  opacity: 50%;
}

.node-junction-box {
  background: $color-junction-box;
  opacity: 50%;
}

.node-switch {
  background: $color-switch;
  opacity: 50%;
}
</style>