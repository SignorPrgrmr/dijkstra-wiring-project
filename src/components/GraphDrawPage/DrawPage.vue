<template>
  <div id="page-container">
    <the-header page="Clear Graph" @ClearGraph="deleteGraph"></the-header>
    <tool-bar></tool-bar>
    <draw-box ref="Graph"></draw-box>
  </div>

<!--  <preview></preview>-->

  <div id="drawPage-backdrop"></div> <!-- close preview when clicked on -->

</template>

<script>
import TheHeader from "../common/TheHeader";
import ToolBar from "./ToolBar";
import DrawBox from "./DrawBox";
export default {
  name: 'DrawPage',
  components: { DrawBox, ToolBar, TheHeader},
  methods:{
    deleteGraph(){
      this.$refs.Grapg.DeleteGraph()
    },
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component on ly -->
<style scoped lang="scss">
@import "./../../../public/-variables";

#page-container {
  height: 100%;
  display: grid;
  grid-template-areas:
    'header header'
    'toolbar drawbox';
  grid-template-rows: 80px auto;
  grid-template-columns: 15% 85%;

}

#drawPage-backdrop {
  @include backdrop;
  display: none;
}
</style>
