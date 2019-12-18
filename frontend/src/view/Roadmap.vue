<template>
  <div>
      <div class='roadmap'>
        <h1>roadmap</h1>
        <div class='roadmap_contents'>
          This is RealRoadmap
        </div>
      </div>
      <div class='curriculum'>
        <h1>curriculum</h1>
        <div class='list'>
          <h4>필수 커리큘럼</h4>
          <ul>
            <li>HTML5 - CSS3 - Javascript - MySQL</li>
            <li>Java</li>
            <li></li>
          </ul>
          <h4>선택 커리큘럼</h4>
          <ul>
            <li>Spring</li>
            <li>Vue.js</li>
            <li>React</li>
          </ul>
        </div>
      </div>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
    .roadmap {
        width: 100%;
        height: 600px;
        margin-top: 20px;
        margin-bottom: 20px;
        padding-top: 20px;
        padding-bottom: 20px;
        background-color:#555555
    }
    .curriculum {
        width: 100%;
        height: 500px;
        margin: 20px 0 20px 0;
        padding: 20px;
        background-color: cornflowerblue;
    }
    .list {
        text-align:start
    }
    .roadmap_contents {
      margin:auto 20px;
      background-color:azure;
      height:80%;
    }

</style>
