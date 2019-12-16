import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/view/Home'
import Content from '@/view/Content'
import Roadmap from '@/view/Roadmap'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/content',
      name: 'Content',
      component: Content
    },
    {
      path: '/roadmap',
      name: 'Roadmap',
      component: Roadmap
    }
  ]
})
