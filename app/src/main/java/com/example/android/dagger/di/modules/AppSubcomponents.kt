package com.example.android.dagger.di.modules

import com.example.android.dagger.di.subcomponents.LoginComponent
import com.example.android.dagger.di.subcomponents.RegistrationComponent
import com.example.android.dagger.user.UserComponent
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, UserComponent::class])
class AppSubcomponents