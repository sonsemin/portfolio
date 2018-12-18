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
        }).catch(e => {
          this.errors.push(e)
        })
      }
    }
  }
</script>

<style scoped>

</style>
