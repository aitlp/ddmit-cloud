<template>
  <div>
    <svg-icon icon-class="question" @click="goto"/>
  </div>
</template>

<script>
export default {
  name: 'DdmitDoc',
  data() {
    return {
      url: 'https://www.ddmit.com'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>
