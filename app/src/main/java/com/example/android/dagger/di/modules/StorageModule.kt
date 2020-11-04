package com.example.android.dagger.di.modules

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class StorageModule {

    @Binds
    abstract fun provideStorage(sharedPreferencesStorage: SharedPreferencesStorage): Storage

}