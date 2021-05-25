<template>
  <div id="nav">
    <the-header></the-header>
    <img-input></img-input>
  </div>
</template>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
<script>
import TheHeader from "./components/common/TheHeader";
import ImgInput from "./components/ImgInput/ImgInput";
export default {
  components: {ImgInput, TheHeader}
}
</script>