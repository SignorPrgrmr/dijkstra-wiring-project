<template>
  <div id="preview-container">
    <label id="close-preview" @click="closePreview">&#x2715;</label>

    <div id="graph-content" v-show="showGraph">
      <svg id="preview-wires">
        <line v-for="Wire in wires" :key='Wire.key' :x1="Wire.x1" :x2="Wire.x2" :y1="Wire.y1" :y2="Wire.y2" :style="Wire.wireStyle"><title>cost = {{ Wire.wireCost }}</title></line>
      </svg>
      <graph-node v-for="Node in nodes" :key="Node.text" :x="Node.x" :y="Node.y" :text="Node.text" :class="Node.mode"></graph-node>
    </div>

    <div id="image-content" v-show="!showGraph"> <!-- this div will have image, and will toggle with "graph-content" -->
      <img :src="imgSrc">
    </div>

    <div id="preview-buttons">
      <button id="toggle-preview" v-show="ImagePreview" @click="toggle">{{ toggleTxt1 }}</button>
      <button id="save-graph">Save Image</button>
    </div>
  </div>
</template>

<script>
import GraphNode from "@/components/GraphDrawPage/GraphNode";
export default {
  name: 'Preview',
  components: {GraphNode},
  data(){
    return{
      imgSrc : "",
      ImagePreview : false ,
      showGraph : true ,
      toggleTxt1 : "View Graph",
      toggleTxt2 : "View Image",
      nodes : [],
      wires : []
    }
  },
  methods:{
    closePreview(){
      this.$emit('closePreview')
    },
    toggle(){
      this.showGraph = !this.showGraph
      let mpt = this.toggleTxt1
      this.toggleTxt1 = this.toggleTxt2
      this.toggleTxt2 = mpt
    },
    DrawGraph(obj){
      this.nodes = obj.nodes
      for (let i = 0 ; i < obj.selectedWires.length ; i++){
        for (let j = 0 ; j < obj.wires.length ; j++){
          if (obj.selectedWires[i].firstNode == obj.wires[j].first && obj.selectedWires[i].secondNode == obj.wires[j].second){
            obj.wires[j].wireStyle = "stroke:rgb(255,0,0);stroke-width:4"
          }
        }
      }
      this.wires = obj.wires
    },
    ImageGraph(obj){
      this.showGraph = false
      this.ImagePreview = true
    //  add nodes and wires to arrays
      console.log(obj)
    //  set sourec for image
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
@import "./../../../public/-variables";

#preview-container {

  width: 80%;
  height: 80%;
  position: fixed;
  top: 10%;
  left: 10%;
  z-index: 3;
  background: #ffffff;
  border-radius: 20px;
  padding: 16px 32px;

  display: flex;
  flex-flow: column nowrap;
  align-items: flex-end;
  justify-content: stretch;

  #close-preview {
    width: 20px;
    height: 20px;
    border: none;
    border-radius: 50%;
    background: black;
    color: white;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 8pt;
  }
  #close-preview:hover {
    background: #3b3b3b;
    cursor: pointer;
  }

  #graph-content {
    display: block; // toggle none and block
    overflow: auto;

    @include preview-box;

    #preview-wires {
      width: 100%;
      height: 100%;
      position: absolute;
      background: transparent;
      top: 0;
      left: 0;
    }
  }

  #image-content {
    display: none; // toggle block and none;

    @include preview-box;
  }

  #save-graph,
  #toggle-preview {
    @include preview-button;
    margin-left: 8px;
  }
  #save-graph:hover,
  #toggle-preview:hover {
    cursor: pointer;
    background: lighten($color-button,10%);
  }
}
</style>
