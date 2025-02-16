package com.example.android.dagger.dagger.components

import android.content.Context
import com.example.android.dagger.dagger.modules.StorageModule
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {
    fun getUserComponentBuilder(): UserComponent.Builder
    fun getLoginComponentBuilder(): LoginComponent.Builder
    fun getRegComponentBuilder(): RegistrationComponent.Builder
    fun getSplashComponentBuilder(): SplashComponent.Builder
    fun getUserManager(): UserManager

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun context(ctx: Context): Builder
    }
}