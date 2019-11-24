package com.dagger.taxiradar.usage

import com.dagger.taxiradar.services.FeatureUsageCount
import javax.inject.Inject

class FeatureUsageRepositoryImpl @Inject constructor(private val featureUsageCountService: FeatureUsageCount) :
    FeatureUsageRepository
