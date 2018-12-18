<template>
  <div id="app">
    <h2>!!!!!!!!!!22222어보즈!!아!!!!!!!!!!</h2>
    <h1>오늘의 마지막 테스트!! !!!! </h1>
    <button v-on:click="searchList">테스트버튼</button>
    <table align="center">
      <tr>
        <th>이메일</th>
        <th>이름</th>
        <th>연락처</th>
      </tr>
      <tr v-for="user in userList">
        <th>{{user.userId}}</th>
        <th>{{user.userName}}</th>
        <th>{{user.phoneNumber}}</th>
      </tr>
    </table>

    <div id="name">
    </div>
  </div>
</template>

<script>
  export default {
    name: 'app',
    data: function () {
      return {
        userList: []
      }
    },
    methods: {
      searchList: function () {
        this.$http.get('/user/list')
          .then((result) => {
            this.userList = result.data
          })
      },
      setList: function () {
        this.$http.post('/board/save', {title: "이거제목이에요", user_id: "이건내용이에요"})
          .then(response => {
            this.searchList()
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
