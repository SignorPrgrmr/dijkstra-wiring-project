<template>
<div>
  <div class="page">
    <div class="buttons">
      <button  class="landing-btn" @click="()=>$router.push('/Image')">Upload Image</button>
      <button class="landing-btn" @click="()=>$router.push('/Draw')">Draw Graph</button>
    </div>

  </div>

</div>
</template>

<script>
export default {
  name:'LandingPage'
}
</script>

<style lang="scss">
div.page{
  background-image: url("../assets/Circuit Board.svg");
  height: 100vh;
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
}


.landing-btn{
  width: 300px;
  height: 95px;
  margin: 30px;
  border: rgba(108, 117, 125, 1) solid 1px;
  border-radius: 15px;
  background-color: rgba(255, 255, 255, 1);
  color: #50575c;
  font-size: 24pt;
}

.landing-btn:hover{
  background-color:rgba(108, 117, 125, 1) ;
  color:rgba(255, 255, 255, 1);
}
</style>
