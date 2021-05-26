<template>
  <div id="box-container"></div>
</template>

<script>
export default {
  name: 'DrawBox',
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

}
</style>
