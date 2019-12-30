<template>
    <div>
        <v-flex v-if="!bAuthentication">
            <!-- Google Login -->
            <v-btn round color="#df4a31"
                    dark
                    @click="loginWithGoogle"
                    style="width:100%;">
                <v-icon size="25" class="mr-2">fa-google</v-icon>Google 로그인
            </v-btn>
        </v-flex>
        <v-flex v-else>
            <v-icon size="100">accessbility_new</v-icon>
            <v-card-text>Welcome!</v-card-text>
        </v-flex>
    </div>
</template>

<script>
import FirebaseService from "@/plugins/FirebaseService"
import { mapState, mapMutations, mapActions } from "vuex"

export default {
  name: 'loginPage',
  computed: {
    ...mapState(["bAuthentication"])
  },
  methods: {
      ...mapActions(["loginWithOauth"]),
      ...mapMutations(["fillUser"]),
      loginWithGoogle() {
        this.loginWithOauth("google")
        this.$router.push({ name: "Home" })
      }
  }
}
</script>

<style scoped>

</style>
