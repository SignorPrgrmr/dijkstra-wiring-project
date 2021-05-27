<template>
  <div>
    <form action="" ref="Imageform">
      <input name="image" type="file" id="fileUpload" v-on:change="loadFile" hidden accept="image/png, image/jpeg">
      <label for="fileUpload">Upload Image</label>
    </form>
    <div class="container pic">
      <img :src="imgSrc" id="preview">
    </div>

  </div>
</template>

<script >
import { mapGetters } from "vuex";

export default {
  name: 'InputImg',
  props: {

  },
  data(){
    return{
      imgSrc: require("@/assets/undraw_Add_files_re_v09g.svg")
    }
  },
  computed: {
    ...mapGetters(['getServerUrl'])
  },
  methods:{
    loadFile(event){
      let src=URL.createObjectURL(event.target.files[0]);
      this.imgSrc = src
    },
    DeleteImage(){
      this.imgSrc = require("@/assets/undraw_Add_files_re_v09g.svg")
    },
    GetImageGraphFromBack(){
      const ImageFormData = new FormData(this.$refs.Imageform)
      fetch(this.getServerUrl + "/api/image", {
        method: "POST",
        body: ImageFormData
      }).then(response =>{
        if (response.ok){
          console.log(response.json())
        }
      })
      // this.$emit('makeGraph' , 'Graph')
    }
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style >
form {
  display: flex;
  justify-content: center;
  height: 20vh;
  align-items: center;
}

label {
  text-align: center;
  font-size: 20px;
  border: 0px;
  border-radius: 20px;
  padding: 0.5rem;
  font-family: sans-serif;
  color: aliceblue;
  background-color: rgba(52, 58, 64, 1);
  width: 12vw;
  height: 27%;
  margin: 0;
  display: flex;
  justify-content: center;
  align-items: center;

}

label:hover {
  box-shadow: 5px 7px rgba(0, 0, 0, 0.05);
}

img {
  width: 50vw;
  height: 60vh;
  border: rgba(206, 212, 218, 1) 2px dashed;
  align-self: center;
  padding: 5px;
  border-radius: 35px;
  box-shadow: 5px 7px rgba(39, 38, 38, 0.041);
}
div.pic {
  height: 60vh;
  display: flex;
  justify-content: center;
  align-items: center;
}


</style>
