<template>
  <div id="page-container">
    <the-header page="Clear Graph" @ClearGraph="deleteGraph" @PreviewGraph="showPreview"></the-header>
    <tool-bar @changeNode="ChangeNode"></tool-bar>
    <draw-box ref="Graph" @makeGraph="MakeGraph"></draw-box>
  </div>

  <div id="drawPage-backdrop" :style="style" @click="hidePreview"></div> <!-- close preview when clicked on -->
  <preview ref="preview" v-show="show" @closePreview="hidePreview"></preview>

</template>

<script>
import TheHeader from "../common/TheHeader";
import ToolBar from "./ToolBar";
import DrawBox from "./DrawBox";
import Preview from "../common/Preview";
export default {
  name: 'DrawPage',
  components: {Preview, DrawBox, ToolBar, TheHeader},
  data(){
    return{
      style : "display : none",
      show : false
    }
  },
  methods:{
    hidePreview(){
      this.show = false
      this.style = "display : none"
      this.$refs.Graph.makeWiresBlack()
    },
    deleteGraph(){
      this.$refs.Graph.DeleteGraph()
    },
    ChangeNode(mode){
      this.$refs.Graph.ChangeNode(mode)
    },
    showPreview(){
      this.show = true
      this.style = "display : block"
      this.$refs.Graph.sendGraph()
    },
    MakeGraph(obj){
      this.$refs.preview.DrawGraph(obj)
    }
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
  display: none; // toggle none and block
}
</style>
