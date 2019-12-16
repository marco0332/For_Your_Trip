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
          <h5>Frontend</h5>
          <ul>
            <li>HTML5</li>
            <li>CSS3</li>
            <li>Javascript</li>
          </ul>
          <h5>Backend</h5>
          <ul>
            <li>MySQL</li>
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
        height: 800px;
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
      height:90%;
    }

</style>
