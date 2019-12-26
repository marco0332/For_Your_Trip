<template>
  <div>
      <div class='header'>
        <b>Header</b>
      </div>

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

      <div class='footer'>
            <b>Footer</b>
        </div>
  </div>
</template>

<script>
export default {

}
</script>

<style scopped>
    .header {
        height: 300px;
        border: 2px dash darksalmon;
        background-color: yellowgreen;
        margin-bottom: 50px;
    }
    .roadmap {
        width: 80%;
        height: 600px;
        margin: 0 auto;
        margin-top: 20px;
        margin-bottom: 20px;
        padding-top: 20px;
        padding-bottom: 20px;
        background-color:#555555
    }
    .curriculum {
        width: 80%;
        height: 500px;
        margin: 0 auto;
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
    .footer {
        height: 200px;
        background-color: bisque;
        margin-top: 40px;
    }

</style>
