<template>
  <div id="imgPage-container">
    <the-header page="Clear Image" @ClearImage="deleteImage" @ClearGraph="deleteGraph"></the-header>
    <input-img ref="Image"></input-img>
  </div>

</template>

<script>
import TheHeader from "../common/TheHeader";
import InputImg from "./ImgInput";
export default {
  name: 'ImgPage',
  components: {InputImg, TheHeader},
  methods:{
    deleteImage(){
      this.$refs.Image.DeleteImage()
    },
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
</style>
