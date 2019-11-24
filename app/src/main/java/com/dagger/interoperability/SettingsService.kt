package com.dagger.interoperability

import com.dagger.bridges.SettingsServiceBridge
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsService @Inject constructor() : SettingsServiceBridge
