package com.dagger.taxiradar

import com.dagger.bridges.SettingsServiceBridge
import com.dagger.core.inject
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxiRadarMapStateTest {

    lateinit var taxiRadarMapState : TaxiRadarMapState

    @Before
    fun before() {
        taxiRadarMapState = TaxiRadarMapState()
    }

    @After
    fun after() {
        unmockkStatic("com.dagger.core.BridgeInjection")
    }

    @Test
    fun printSettings() {
        mockkStatic("com.dagger.core.BridgeInjection")
        every { inject(SettingsServiceBridge::class) } returns mockk()
        taxiRadarMapState.printSettings()

    }


}
