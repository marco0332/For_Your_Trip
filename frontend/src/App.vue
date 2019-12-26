<template>
  <div id="app">
    <Nav />
    <router-view id="routerView" />
    <Footer />
  </div>
</template>

<script>
import Nav from './components/Nav'
import Footer from './components/Footer'

export default {
  name: 'App',
  components: {
    Nav,
    Footer
  }
}
</script>

<style scoped>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  min-height: 100vh;
  height: 100%;
  background: url('./assets/background.png') repeat;
}

#routerView {
  margin-top: 64px;
  min-height: calc(100vh - 64px);
}
</style>
