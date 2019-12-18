<template>
  <v-app id="nav">
    <v-toolbar class="navBackgroundColor"
               height="64px"
               absolute
               scroll-off-screen>
      <v-toolbar-items>
        <v-btn id="toHome"
               to="/"
               exact
               class="englishFont navFont subNavColor"
               flat>Home</v-btn>
        <v-menu open-on-hover
                dark
                origin="top left"
                transition="slide-y-transition">
          <template v-slot:activator="{ on }">
            <v-btn id="toLectureList"
                   to="/roadmap"
                   class="englishFont navFont mainFontColor"
                   flat
                   v-on="on">
              Class & Roadmap
            </v-btn>
          </template>
          <div id="lectureList"
               class="navBackgroundColor subMenuFont subNavColor">
            <v-layout>
              <v-flex sm3 md2>
                <v-layout>
                  <v-btn flat
                         to="/roadmap"
                         class="subNavFont subFontColor"
                         style="margin-bottom: 17px">
                    • Roadmap
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/frontend"
                         class="subNavFont mainFontColor">
                    • Front-end
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/html"
                         class="subLectureFont subNavColor">
                    - HTML5
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/css"
                         class="subLectureFont subNavColor">
                    - CSS3
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/javascript"
                         class="subLectureFont subNavColor">
                    - Javascript
                  </v-btn>
                </v-layout>
              </v-flex>
              <v-flex sm3 md2>
                <v-layout>
                  <v-btn flat
                        to="/backend"
                        class="subNavFont blueFontColor">
                    • Backend
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/java"
                         class="subLectureFont subNavColor">
                    - Java
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/mysql"
                         class="subLectureFont subNavColor">
                    - MySql
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/spring"
                         class="subLectureFont subNavColor">
                    - Spring
                  </v-btn>
                </v-layout>
              </v-flex>
              <v-flex sm3 md2>
                <v-layout>
                  <v-btn flat
                        to="/more"
                        class="subNavFont brownFontColor">
                    • More
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/crwaling"
                         class="subLectureFont subNavColor">
                    - Crwaling
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/vuejs"
                         class="subLectureFont subNavColor">
                    - Vue.js
                  </v-btn>
                </v-layout>
                <v-layout>
                  <v-btn flat
                         to="/lecture/theory"
                         class="subLectureFont subNavColor">
                    - Theory
                  </v-btn>
                </v-layout>
              </v-flex>
            </v-layout>
          </div>
        </v-menu>
        <v-btn id="toGit"
               to="/git"
               class="englishFont navFont subNavColor"
               flat>Git</v-btn>
        <v-btn id="toInfoTong"
               to="/infoTong"
               class="koreanFont navFont subNavColor"
               flat>정보통</v-btn>
        <v-btn id="toBoard"
               to="/board"
               class="koreanFont navFont subNavColor"
               flat>질문게시판</v-btn>
      </v-toolbar-items>
    <v-spacer />
    <v-btn id="toLogin"
           to="/login"
           class="koreanFont navFont subNavColor"
           flat>로그인</v-btn>
    </v-toolbar>
  </v-app>
</template>

<script>
import '../css/mainStyle.css'

export default {

}
</script>

<style scoped>
#toLectureList:hover:before {
  opacity: 0;
  background-color: #eec40f!important;
}

.englishFont {
  font-family: 'Kalam', cursive;
  font-size: 1.95rem;
}

.subMenuFont {
  font-family: 'Kalam', cursive;
  font-size: 1.75rem;
  font-weight: bold;
}

.koreanFont {
  font-family: 'slowFont';
  font-size: 2.55rem;
}

#nav {
  height: 64px;
}

div.v-menu__content {
  /* background-color: #fff3e9; */
  top:0!important;
  z-index: 1!important;
  max-width: 100%!important;
  width: 100%!important;
}

nav {
  box-shadow: none;
}

#lectureList {
  position: relative;
  margin-top: 64px;
  margin-bottom: 0;
  text-align: left;
  padding: 0 0 5px 96.68px;
}

.navFont {
  text-transform: none!important;
  font-weight: bold;
}

.subNavFont {
  text-transform: none!important;
  font-family: 'Kalam', cursive;
  font-size: 1.65rem;
  font-weight: bold;
}

.subLectureFont {
  text-transform: none!important;
  font-family: 'Kalam', cursive;
  font-size: 1.15rem;
  font-weight: bold;
  margin-left: 24px;
}

.noTransform {
  text-transform: none!important;
}

.fontsizeUp {
  font-size: 1.7rem;
}

.bold {
  font-weight: bold;
}

#toLogin {
  height: inherit;
}

.toBlock > div {
  color: red!important;
}
</style>
