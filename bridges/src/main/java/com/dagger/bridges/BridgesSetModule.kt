package com.dagger.bridges

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class BridgesSetModule {

    // This is a hack to be able to create test for classes with field injection
    @Binds
    @IntoSet
    abstract fun bindLoginService(loginService: LoginServiceBridge): Bridge

    @Binds
    @IntoSet
    abstract fun bindLRuntimeManipulationServiceBridge(loginService: RuntimeManipulationServiceBridge): Bridge

    @Binds
    @IntoSet
    abstract fun bindSettingsServiceBridge(loginService: SettingsServiceBridge): Bridge
}
