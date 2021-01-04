package com.example.android.dagger.splash

import com.example.android.dagger.user.UserManager
import com.example.android.dagger.user.UserState
import javax.inject.Inject

class SplashViewModel @Inject constructor(private val userManager: UserManager) {

    /**
     * If the User is not registered, RegistrationActivity will be launched,
     * If the User is not logged in, LoginActivity will be launched,
     * else carry on with MainActivity
     */

    fun userState() =
        if (!userManager.isUserLoggedIn()) {
            if (!userManager.isUserRegistered()) {
                UserState.REGISTER
            } else {
                UserState.LOG_IN
            }
        } else {
            UserState.LOGGED_IN
        }


}