<template>
  <div id="imgPage-container">
    <the-header page="Clear Image" @ClearImage="deleteImage" @PreviewImageGraph="PreviewImageGraph"></the-header>
    <input-img ref="Image" @makeGraph="MakeGraph"></input-img>
    <div class="preview" v-if="Preview">
      <div class="inner" @click="hidePreview">
        <preview ref="PreviewPage"></preview>
      </div>
    </div>
  </div>

</template>

<script>
import TheHeader from "../common/TheHeader";
import InputImg from "./ImgInput";
import Preview from "../common/Preview";
export default {
  name: 'ImgPage',
  components: {Preview, InputImg, TheHeader},
  data(){
    return{
      Preview : false,
    }
  },
  methods:{
    deleteImage(){
      this.$refs.Image.DeleteImage()
    },
    PreviewImageGraph(){
      this.Preview = true
      this.$refs.Image.GetImageGraphFromBack()
    },
    MakeGraph(graph){
      // this.$refs.PreviewPage.DrawGraph(graph)
      console.log(graph)
    },
    hidePreview(){
      this.preview = false
    }
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
#imgPage-container {
  display: grid;
  grid-template-areas:
  'header'
  'body';
  height: 100%;
  grid-template-rows: 80px auto;
}

.preview{
  width: 100vw;
  height: 100vh;
  position: fixed;
  background-color: rgba(0, 0, 0, 0.2);
  display: flex;
  top: 0;
  left: 0;
  justify-content: center;
  align-items: center;
}


.inner{
  position: fixed;
  border-radius: 15px;
  width: 70%;
  height: 70%;
  background-color: aliceblue;
  margin: 0px;
}

</style>
