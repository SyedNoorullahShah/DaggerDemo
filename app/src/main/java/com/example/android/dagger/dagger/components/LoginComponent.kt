package com.example.android.dagger.dagger.components

import com.example.android.dagger.login.LoginActivity
import dagger.Subcomponent

@Subcomponent
interface LoginComponent {
    fun inject(loginActivity: LoginActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): LoginComponent
    }
}