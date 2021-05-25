<template>
<div>
  <div class="page">
    <div class="buttons">
      <button  class="upload">Upload Image</button>
      <button class="draw">Draw Graph</button>
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
  //background-image: url("../assets/Circuit Board.svg");
  height: 100vh;
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
}


button{
  width: 200px;
  height: 50px;
  margin: 10px;
  border: rgba(108, 117, 125, 1) solid 1px;
  border-radius: 15px;
  background-color: rgba(255, 255, 255, 1);
  font-size: 1.5em;

}

button:hover{
  background-color:rgba(108, 117, 125, 1) ;
  color:rgba(255, 255, 255, 1);
}
</style>
