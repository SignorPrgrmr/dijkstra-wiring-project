<template>
  <div id="nav">
    <the-header></the-header>
    <img-input></img-input>
  </div>
</template>

<style lang="scss">

</style>
<script>
import TheHeader from "./components/common/TheHeader";
import ImgInput from "./components/ImgInput/ImgInput";
export default {
  components: {ImgInput, TheHeader}
}
</script>