<template>
  <v-app id="nav">
    <v-toolbar dark
               absolute
               scroll-off-screen>
      <v-toolbar-items>
        <v-btn flat>Home</v-btn>
        <v-btn flat>Git</v-btn>
        <v-btn flat>강의 목록</v-btn>
        <v-btn flat>정보통</v-btn>
        <v-btn flat>질문게시판</v-btn>
        <v-btn flat>로그인</v-btn>
      </v-toolbar-items>
    </v-toolbar>
  </v-app>
</template>

<script>
export default {

}
</script>

<style scoped>
#nav2 {
    position: fixed;
    height: 64px;
}
</style>
