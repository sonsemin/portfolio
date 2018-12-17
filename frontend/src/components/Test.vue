<template>
  <div id="app">
    <h2>!!!!!!!!!!22222어보즈!!아!!!!!!!!!!</h2>
    <h1>오늘의 마지막 테스트!! !!!! </h1>
    <button v-on:click="searchList">테스트버튼</button>
    <div v-for="post in posts" v-bind:key="post.id">
      <h2>{{post.id}}</h2>
      <p>{{post.title}}</p>
    </div>

    <button v-on:click="setList">포스트!</button>

    <div id="name">
    </div>
  </div>
</template>

<script>
export default {
  name: 'app',
  data: function(){
    return{
      posts:[]
    }
  },
  methods:{
    searchList:function(){
      this.$http.get('/board/list')
        .then((result) => {
          this.posts = result.data
      })
    },
    setList:function(){
      this.$http.post('/board/save', {title:"이거제목이에요",  user_id:"이건내용이에요"})
        .then(response => {
          this.searchList();
        })
        .catch(e => {
          this.errors.push(e)
        })
    }
  }
}
</script>

<style>

</style>
