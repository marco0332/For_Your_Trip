import Vue from "vue"
import Vuex from "vuex"
import FirebaseService from "./FirebaseService"

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    userName: "",
    uid: "",
    grade: "",
    bAuthentication: false
  },
  mutations: {
    fillUser (state, payload) {
      state.userName = payload.displayName
      state.uid = payload.uid
      state.grade = payload.grade;
      state.bAuthentication = true
    },
    deleteUser(state) {
      state.userName = ""
      state.uid = ""
      state.bAuthentication.grade = null
      state.bAuthentication = false
    }
  },
  actions: {
    loginWithOauth ({ commit, state }, providerName) {
      FirebaseService.loginWithOauth(providerName).then(result => {
        commit("fillUser", result.user)
      })
      .catch(() => {
        FirebaseService.setUserInfo(result.user.uid, result.user.email, 3, result.user.displayName)
      })
    },
    signOut ({ commit, state }) {
      FirebaseService.signOut().then(() => {
          commit("deleteUser")
      })
    }
  }
})