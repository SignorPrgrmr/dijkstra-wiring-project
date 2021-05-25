<template>
<div>
  <div class="page">
    <div class="buttons">
      <button  class="upload"><a href="./page2" >Upload Image</a></button>
      <button class="draw"><a href="./page3" >Draw Graph</a></button>
    </div>

  </div>

</div>
</template>

<style lang="scss">
div.page{
  background-image: url("../assets/Circuit Board.svg");
  height: 100vh;
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
}

div.buttons{

}

button{
  width: 200px;
  height: 50px;
  margin: 10px;
  border: rgba(108, 117, 125, 1) solid 1px;
  border-radius: 15px;
  background-color: rgba(255, 255, 255, 1);
  font-size: 1.5em;
  padding: 0px;

}

button:hover{
  background-color:rgba(108, 117, 125, 1) ;


}

a{
  color: rgba(108, 117, 125, 1) ;
  font-family: sans-serif;
  text-decoration: none;
  padding: 5px 5px;
  border-radius: 10px;
  margin: 0px;

}

a:hover{
  background-color:rgba(108, 117, 125, 1) ;
  color:rgba(255, 255, 255, 1);
}
</style>
<script>
export default {

}
</script>