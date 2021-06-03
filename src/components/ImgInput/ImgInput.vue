<template>
  <div>
    <form action="" ref="Imageform">
      <input name="image" type="file" id="fileUpload" v-on:change="loadFile" hidden accept="image/png, image/jpeg">
      <label id="fileUpload-label" for="fileUpload">Upload Image</label>
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
          return response.json()
        }
      }).then(json=>{
        this.$emit('makeGraph' , json)
      })
      // test
      // const json = {
      //   graph : {
      //     nodes : ['P' , 'J1' , 'J2' , 'J3' , 'J4' , 'S1' , 'S2'],
      //     edges : [
      //       {firstNode : 'P' , secondNode : 'J1' , cost : 12} ,
      //       {firstNode : 'J2' , secondNode : 'S1' , cost : 5} ,
      //       {firstNode : 'S1' , secondNode : 'J4' , cost : 15} ,
      //       {firstNode : 'J4' , secondNode : 'S2' , cost : 18} ,
      //       {firstNode : 'S2' , secondNode : 'J3' , cost : 25} ,
      //     ]
      //   },
      //   image : 'E:\\Background\\2018-Bozkurt-Wallpaper.jpg'
      // }
      //   this.$emit('makeGraph' , json)
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

#fileUpload-label {
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

#fileUpload-label:hover {
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
