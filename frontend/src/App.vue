<template>
  <div id="app">
    <Nav />
    <router-view id="routerView" />
  </div>
</template>

<script>
import Nav from './components/Nav'

export default {
  name: 'App',
  components: {
    Nav
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
  height: 100vh;
  background: url('./assets/background.png') repeat;
}

#routerView {
  margin-top: 64px;
}
</style>
