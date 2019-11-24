package com.dagger.interoperability

import com.dagger.core.CoreApplication
import com.dagger.core.CoreComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, BridgesModule::class])
interface MainComponent : CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: CoreApplication): CoreComponent
    }

}
