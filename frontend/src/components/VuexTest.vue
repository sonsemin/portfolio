<template>
  <div id="app">
    Parent counter : {{ getCounter  }} <br>
    <button @click="addCounter">+</button>
    <button @click="subCounter">-</button>

    <!-- <child v-bind:passedCounter="counter"></child> -->
    <child></child>
  </div>
</template>

<script>
  import Child from './VuexTestChild'
  import { mapGetters } from 'vuex'
  import { mapMutations } from 'vuex'

  export default {
    name: "VuexTest",
    // data() {
    //   return {
    //     // data 속성 등록
    //     counter: 0
    //   }
    // },
    methods: {
      // 이벤트 추가
      addCounter() {
       this.$store.commit('addCounter' , {value:7 , arr:["a","b"]});
      },
      subCounter() {
        this.$store.state.counter--;
      },
    },
    computed:mapGetters([
      'getCounter'
    ]),
    components: {
      // Child 컴포넌트를 하위 컴포넌트로 등록
      'child': Child
    }
  }

</script>

<style scoped>

</style>
