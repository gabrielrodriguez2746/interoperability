package com.dagger.taxiradar.services

import com.dagger.bridges.RuntimeManipulationServiceBridge
import com.dagger.bridges.SettingsServiceBridge
import javax.inject.Inject

class PrioDriverServiceImpl @Inject
constructor(
    private val settingsService: SettingsServiceBridge,
    private val runtimeManipulations: RuntimeManipulationServiceBridge
) : PrioDriverService
