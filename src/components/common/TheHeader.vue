<template>
  <div>
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
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  display: flex;
  flex-flow: nowrap row;
  width: 100%;
  background-color: rgba(108, 117, 125, 1);
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
}

li:hover {
  background-color: aliceblue;
}

a:hover {
  color: rgba(108, 117, 125, 1);
  background-color: aliceblue;
}</style>
