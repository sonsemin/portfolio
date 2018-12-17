<template>
  <div>
    <hr>
    Child counter : {{ childCounter }} <br>
    <button>+</button>
    <button>-</button>
  </div>
</template>

<script>
  export default {
    name: "VuexTestChild",
    //props: ['passedCounter']
    computed:{
      childCounter(){
        return this.$store.getters.getCounter;
      }
    }
  }
</script>

<style scoped>

</style>
