<template>
  <v-layout id="nav">
    <v-flex>Home</v-flex>
    <v-flex>Git</v-flex>
    <v-flex>강의 목록</v-flex>
    <v-flex>정보통</v-flex>
    <v-flex>질문게시판</v-flex>
    <!-- 회원 메뉴 -->
    <v-spacer />
    <v-flex>로그인</v-flex>
  </v-layout>
</template>

<script>
export default {

}
</script>

<style scoped>
#nav {
    position: fixed;
    height: 64px;
}
</style>
