<template>
  <div id="app">
    <form id="UserForm" @submit.prevent="userJoin">
      <h1>회원가입</h1><br>
      이메일주소 : <input type="email" v-model="userId"><br>
      비밀번호 : <input type="password" v-model="password"><br>
      이름 : <input type="text" v-model="userName"><br>
      연락처 : <input type="tel" v-model="phoneNumber"><br>
      <button type="submit">가입!!!</button>
    </form>
  </div>
</template>

<script>
export default {
    name: "UserJoin",
    data() {
      return {
        userId: '',
        password: '',
        userName: '',
        phoneNumber: ''
      }
    },
    methods: {
      userJoin() {
        const userId = this.userId
        const password = this.password
        const userName = this.userName
        const phoneNumber = this.phoneNumber
        if (!userId || !password || !userName) {
          alert('이메일주소 , 비밀번호 , 이름은 필수 입력입니다')
          return false;
        }
        this.$http.post('/user/save', {
          userId: userId, password: password, userName: userName, phoneNumber: phoneNumber
        }).then(response => {
          console.log(response)
          this.$router.push('/test')
        }).catch(error => {
          if (error.response) {
            console.log(error.response.data);
            console.log(error.response.status);
            console.log(error.response.headers);
          } else if (error.request) {
            // The request was made but no response was received
            // `error.request` is an instance of XMLHttpRequest in the browser and an instance of
            // http.ClientRequest in node.js
            console.log(error.request);
          } else {
            // Something happened in setting up the request that triggered an Error
            console.log('Error', error.message);
          }
          console.log(error.config);
        })
      }
    }
  }
</script>

<style scoped>

</style>
