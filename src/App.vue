<template>
<!--  <img-page></img-page>-->
  <draw-page></draw-page>
</template>

<style lang="scss">
body {
  margin: 0;
  padding: 0;
  height: 100vh;
}
</style>
<script>
import DrawPage from "./components/GraphDrawPage/DrawPage";
export default {
  components: {DrawPage}
}
</script>