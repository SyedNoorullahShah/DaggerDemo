package com.example.android.dagger.dagger.modules

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun bindStorage(storage: SharedPreferencesStorage): Storage
}
