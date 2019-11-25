package com.dagger.taxiradar

import com.dagger.bridges.RuntimeManipulationServiceBridge
import com.dagger.bridges.SettingsServiceBridge
import com.dagger.core.inject

class TaxiRadarMapState {

    private val bridge: SettingsServiceBridge by lazy {
        inject(SettingsServiceBridge::class)
    }
    private val bridge2: RuntimeManipulationServiceBridge by lazy {
        inject(RuntimeManipulationServiceBridge::class)
    }

    fun print() {
        printSettings()
        printRuntime()
    }

    internal fun printRuntime() {
        println("I am state with runtime ${bridge2.hashCode()}")
    }

    internal fun printSettings() {
        println("I am state with settings ${bridge.hashCode()}")
    }

}
