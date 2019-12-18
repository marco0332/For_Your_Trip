<template>
  <div>
      <div class='header'>
        <b>Header</b>
      </div>

      <!-- Roadmap -->
      <div class='roadmap'>
        <h1>roadmap</h1>
        <div class='roadmap_contents'>
          This is RealRoadmap
        </div>
      </div>

      <!-- Curriculum -->
      <div class='curriculum'>
        <h1>curriculum</h1>
        <v-app id="inspire">
          <div>
            <v-tabs
              v-model="active"
              color="transparent"
              dark
              slider-color="yellow"
            >
              <v-tab class="orange--text"
                v-for="n in 3"
                :key="n"
                ripple
              >
                Item {{ n }}
              </v-tab>
              <v-tab-item
                v-for="n in 3"
                :key="n"
              >
                <v-card flat>
                  <v-card-text>{{ text }}</v-card-text>
                </v-card>
              </v-tab-item>
            </v-tabs>
          </div>
        </v-app>
      <div class="text-xs-center mt-3">
        <v-btn @click="next">next</v-btn>
      </div>
    </div>

    <div class='footer'>
        <b>Footer</b>
    </div>
  </div>
</template>

<script type="text/javascript">
export default {
  data () {
    return {
      active: null,
      text: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.'
    }
  },
  methods: {
    next () {
      const active = parseInt(this.active)
      this.active = (active < 2 ? active + 1 : 0)
    }
  }
}
</script>

<style scopped>
    .v-card {
      background-color: transparent !important;
      padding-top: 20px;
    }
    .application--wrap {
      height: 400px !important;
      max-height: 400px;
      min-height: 300px;
    }

    .theme--light.application {
      background-color: transparent !important;
    }
    
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
        height: 530px;
        margin: 0 auto;
        padding: 20px;
        border: 1px dashed cornflowerblue;
    }
    .list {
        text-align:start
    }
    .roadmap_contents {
      margin:auto 20px;
      margin-top: 30px;
      background-color:azure;
      height:80%;
    }

    .footer {
        height: 200px;
        background-color: bisque;
        margin-top: 40px;
    }
</style>
