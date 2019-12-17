<template>
  <v-app id="nav">
    <v-toolbar dark
               height="64px"
               absolute
               scroll-off-screen>
      <v-toolbar-items>
        <v-btn id="toHome" flat>Home</v-btn>
        <v-btn id="toGit" flat>Git</v-btn>
        <v-menu open-on-hover
                dark
                origin="top left"
                transition="slide-y-transition">
          <template v-slot:activator="{ on }">
            <v-btn id="toLectureList" flat v-on="on">
              Class & Roadmap
            </v-btn>
          </template>
          <div id="lectureList">
            <p>testsetst</p>
            <p>testsetst</p>
            <p>testsetst</p>
            <p>testsetst</p>
            <p>testsetst</p>
          </div>
        </v-menu>
        <v-btn id="toInfoTong" flat>정보통</v-btn>
        <v-btn id="toBoard" flat>질문게시판</v-btn>
        <v-btn id="toLogin" flat>로그인</v-btn>
      </v-toolbar-items>
    </v-toolbar>
  </v-app>
</template>

<script>
export default {

}
</script>

<style scoped>
#nav {
  height: 64px;
}

div.v-menu__content {
  background-color: #212121;
  z-index: 0!important;
}

#lectureList {
  position: relative;
  margin-top: 64px;
  margin-bottom: 0;
  background-color:#212121;
  color: white;
}
</style>
