<template>
  <div id="header-container">
    <ul id="header-list">
      <li class="list-item"><a @click="()=>$router.push('/')">Home</a></li>
      <li class="list-item"><a @click="Clear">{{ page }}</a></li>
      <li class="list-item"><a @click="ShowPreview">Finish</a></li>
    </ul>

  </div>
</template>

<script >
export default {
  name: 'TheHeader',
  props: [
      'page'
  ],
  methods:{
    Clear(){
      if(this.page == 'Clear Image'){
        this.$emit('ClearImage')
      }
      else{
        this.$emit('ClearGraph')
      }
    },
    ShowPreview(){
      if(this.page == 'Clear Image'){
        this.$emit('PreviewImageGraph')
      }
      else{
        this.$emit('PreviewGraph')
      }
    }
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style lang="scss">

#header-container {
  grid-area: header;
  width: 100%;
  max-height: 80px;
  /*height: 10%;*/
  display: flex;
  flex-flow: nowrap row;
  justify-content: left;
  align-items: center;
  background: #6C757D;

  #header-list {
    list-style-type: none;
    margin: 0;
    padding: 0;
    display: flex;
    flex-flow: nowrap row;

    .list-item {
      display: inline;
      margin: 8px;
      border-radius: 10px;
      font-size: 16pt;
      cursor: pointer;
      padding: 0;

      a {
        font-family: sans-serif;
        text-decoration: none;
        color: aliceblue;
        padding: 8px 16px;
        border-radius: 10px;
      }
      a:hover {
        color: rgba(108, 117, 125, 1);
        background-color: aliceblue;
      }
    }

  }
}


</style>
