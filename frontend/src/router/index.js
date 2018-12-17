import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Test from '@/components/Test'
import Main from '@/components/Main'
import VuexTest from '@/components/VuexTest'


Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main
    },
    {
      path: '/test',
      name: 'Test',
      component: Test
    },
    {
      path: '/vuextest',
      name: 'VuexTest',
      component: VuexTest
    }
  ]
})
