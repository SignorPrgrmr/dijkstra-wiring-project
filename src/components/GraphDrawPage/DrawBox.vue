<template>
  <div id="box-container">draw box</div>
</template>

<script>
export default {
  name: 'DrawBox',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
#box-container {
  grid-area: drawbox;
  width: 100%;
  height: 100%;
  background: red;

}
</style>
