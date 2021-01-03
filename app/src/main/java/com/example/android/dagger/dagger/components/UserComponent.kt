package com.example.android.dagger.dagger.components

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@Subcomponent
interface UserComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(settingsActivity: SettingsActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): UserComponent
    }
}