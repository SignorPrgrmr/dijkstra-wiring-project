<template>
  <div id="header-container">
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">ClearAll</a></li>
      <li><a href="#">Finish</a></li>
    </ul>

  </div>
</template>

<script >

export default {
  name: 'TheHeader',
  props: {

  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style >
#header-container{
  grid-area: header;
  width: 100%;
  max-height: 80px;
  /*height: 10%;*/
  display: flex;
  flex-flow: nowrap row;
  justify-content: left;
  align-items: center;
  background: #6C757D;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  display: flex;
  flex-flow: nowrap row;
  /*width: 100%;*/
}

a {
  font-family: sans-serif;
  text-decoration: none;
  color: aliceblue;
  padding: 5px 5px;
  border-radius: 10px;
}

li {
  display: inline;
  margin: 20px 20px;
  border-radius: 10px;
  font-size: 16pt;
}

li:hover {
  background-color: aliceblue;
}

a:hover {
  color: rgba(108, 117, 125, 1);
  background-color: aliceblue;
}</style>
