package com.dagger.interoperability

import com.dagger.bridges.Bridge
import com.dagger.bridges.LoginServiceBridge
import com.dagger.bridges.RuntimeManipulationServiceBridge
import com.dagger.bridges.SettingsServiceBridge
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet

@Module
abstract class BridgesModule {

    @Binds
    abstract fun bindLoginService(loginService: LoginService): LoginServiceBridge

    @Binds
    abstract fun bindSettingsService(settingsService: SettingsService): SettingsServiceBridge

    @Binds
    abstract fun bindRuntimeManipulationService(settingsService: RuntimeManipulationService): RuntimeManipulationServiceBridge

}
