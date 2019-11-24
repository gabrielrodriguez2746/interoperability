package com.dagger.taxiradar.services

import com.dagger.bridges.LoginServiceBridge

import javax.inject.Inject

class FeatureUsageCountService @Inject constructor(
    private val loginServiceBridge: LoginServiceBridge
) : FeatureUsageCount
