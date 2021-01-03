package com.example.android.dagger.dagger.components

import android.content.Context
import com.example.android.dagger.dagger.modules.StorageModule
import com.example.android.dagger.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun getLoginComponentBuilder(): LoginComponent.Builder
    fun getRegComponentBuilder(): RegistrationComponent.Builder

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun context(ctx: Context): Builder
    }
}