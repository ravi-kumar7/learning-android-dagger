package com.example.android.dagger.user

import com.example.android.dagger.di.scope.LoggedUserScope
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@LoggedUserScope
@Subcomponent
interface UserComponent{

    @Subcomponent.Factory
    interface Factory{
        fun create():UserComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(activity: SettingsActivity)

}