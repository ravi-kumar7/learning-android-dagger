package com.example.android.dagger.di.subcomponents

import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }
    fun inject(loginActivity: LoginActivity)

}