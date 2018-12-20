<template>
  <div id="app">
    <img src="./assets/logo.png"><br>
    <p>
      <router-link to="/">홈 </router-link>
      <router-link to="/test">test고고고</router-link>
      <router-link to="/vuextest">vuex테스트</router-link>
      <router-link to="/userjoin">회원가입</router-link>
    </p>
      <router-view/>
  </div>
</template>

<script>
  export default {
    name: 'App'
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
