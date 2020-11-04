package com.example.android.dagger.di.components

import android.content.Context
import com.example.android.dagger.di.modules.AppSubcomponents
import com.example.android.dagger.di.modules.StorageModule
import com.example.android.dagger.di.subcomponents.RegistrationComponent
import com.example.android.dagger.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun registrationComponent(): RegistrationComponent.Factory
    fun inject(mainActivity: MainActivity)

}