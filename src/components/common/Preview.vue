<template>
<div>

  <div class="preview">
    <div class="inner">

    </div>
  </div>

</div>
</template>

<script>
export default {
  name: 'Preview',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
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
