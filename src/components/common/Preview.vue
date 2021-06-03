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
      <button id="save-graph" @click="save">Save Image</button>
    </div>
  </div>
</template>

<script>
import GraphNode from "@/components/GraphDrawPage/GraphNode";
import html2canvas from 'html2canvas';

export default {
  name: 'Preview',
  components: {GraphNode},
  data(){
    return{
      key : 0,
      imgSrc : "",
      ImagePreview : false ,
      showGraph : true ,
      toggleTxt1 : "View Graph",
      toggleTxt2 : "View Image",
      nodes : [],
      wires : [],
    }
  },
  methods:{
    closePreview(){
      this.key = 0
      this.imgSrc = ""
      this.ImagePreview = false
      this.showGraph = true
      this.toggleTxt1 = "View Graph"
      this.toggleTxt2 = "View Image"
      this.nodes = []
      this.wires = []
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
      this.wires = [...obj.wires]
      for (let i = 0 ; i < obj.selectedWires.length ; i++){
        for (let j = 0 ; j < this.wires.length ; j++){
          if ((obj.selectedWires[i].firstNode == this.wires[j].first && obj.selectedWires[i].secondNode == this.wires[j].second) ||
              (obj.selectedWires[i].firstNode == this.wires[j].second && obj.selectedWires[i].secondNode == this.wires[j].first)){
            this.wires[j].wireStyle = "stroke:rgb(255,0,0);stroke-width:4"
          }
        }
      }
    },
    ImageGraph(obj){
      this.showGraph = false
      this.ImagePreview = true
      //  add nodes and wires to arrays
      for (let i = 0 ; i < obj.graph.nodes.length ; i++){
        let x = (Math.random() * 600) + 100
        let y = (Math.random() * 300) + 100
        let Class = ''
        switch (obj.graph.nodes[i].charAt(0)){
          case 'P':
            Class = 'node-power-source';
             break;
          case 'J':
            Class = 'node-junction-box';
            break;
          case 'S':
            Class = 'node-switch';
            break;
        }
        const newNode = {
          text : obj.graph.nodes[i],
          x : x,
          y : y,
          mode : Class
        }
        this.nodes.push(newNode)
      }
      for (let j = 0 ; j < obj.graph.edges.length ; j++){
        let firstx = 0
        let firsty = 0
        let secondx = 0
        let secondy = 0
        for (let i = 0 ; i < this.nodes.length ;i++){
          if(obj.graph.edges[j].firstNode == this.nodes[i].text ){
            firstx = this.nodes[i].x + 12.5
            firsty = this.nodes[i].y + 12.5
          }
          if(obj.graph.edges[j].secondNode == this.nodes[i].text ){
            secondx = this.nodes[i].x + 12.5
            secondy = this.nodes[i].y + 12.5
          }
        }
        const newWire = {
          first: obj.graph.edges[j].firstNode,
          second: obj.graph.edges[j].secondNode,
          x1: firstx,
          y1: firsty,
          x2: secondx,
          y2: secondy,
          wireCost: obj.graph.edges[j].cost,
          wireStyle : "stroke:rgb(0,0,0);stroke-width:4",
          key :this.key
        }
        this.wires.push(newWire)
      }
      this.imgSrc = require(obj.image)
    },
    save(){
      html2canvas(document.getElementById('graph-content')).then(function(canvas) {
        const aEl = document.createElement('a')
        aEl.setAttribute('href' , canvas.toDataURL('image/jepg'))
        aEl.setAttribute('download' , 'download')
        aEl.setAttribute('style' , 'display : none')
        aEl.click()
      });
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
    //display: none; // toggle block and none;

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
