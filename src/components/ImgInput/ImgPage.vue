<template>
  <the-header>
  </the-header>
  <input-img></input-img>
</template>

<script>
import TheHeader from "../common/TheHeader";
import InputImg from "./ImgInput";
export default {
  name: 'ImgPage',
  components: {InputImg, TheHeader},
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

</style>
