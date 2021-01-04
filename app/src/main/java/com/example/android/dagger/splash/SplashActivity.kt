package com.example.android.dagger.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.dagger.MyApplication
import com.example.android.dagger.R
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.user.UserState
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.getSplashComponentBuilder().build().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val destinationActivity = when (splashViewModel.userState()) {
            UserState.REGISTER -> RegistrationActivity::class.java
            UserState.LOG_IN -> LoginActivity::class.java
            else -> MainActivity::class.java
        }

        startActivity(Intent(this, destinationActivity))
        finish()

    }
}