package com.example.android.dagger.dagger.components

import com.example.android.dagger.splash.SplashActivity
import dagger.Subcomponent

@Subcomponent
interface SplashComponent {
    fun inject(splashActivity: SplashActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): SplashComponent
    }
}