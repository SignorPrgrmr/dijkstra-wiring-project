<template>
  <div id="preview-container">

  </div>
</template>

<script>
export default {
  name: 'Preview',
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
}
</style>
