<template>
  <div id="page-container">
    <the-header></the-header>
    <tool-bar></tool-bar>
    <draw-box></draw-box>
  </div>

</template>

<script>
import TheHeader from "../common/TheHeader";
import ToolBar from "./ToolBar";
import DrawBox from "./DrawBox";
export default {
  name: 'DrawPage',
  components: {DrawBox, ToolBar, TheHeader},
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component on ly -->
<style scoped lang="scss">
#page-container {
  height: 100%;
  display: grid;
  grid-template-areas:
    'header header header header'
    'toolbar drawbox drawbox drawbox';
  grid-template-rows: 10% 90%;
}
</style>
