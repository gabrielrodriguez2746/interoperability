package com.dagger.taxiradar

import com.dagger.taxiradar.peaktime.PeakTimeRepository
import com.dagger.taxiradar.peaktime.PeakTimeRepositoryImpl
import com.dagger.taxiradar.services.*
import com.dagger.taxiradar.usage.FeatureUsageRepository
import com.dagger.taxiradar.usage.FeatureUsageRepositoryImpl
import com.dagger.taxiradar.vehicleradar.VehicleRadarRepository
import com.dagger.taxiradar.vehicleradar.VehicleRadarRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindPeakTimeRepository(repository: PeakTimeRepositoryImpl): PeakTimeRepository

    @Binds
    abstract fun bindFeatureUsageRepository(repository: FeatureUsageRepositoryImpl): FeatureUsageRepository

    @Binds
    abstract fun bindPoiRepository(repository: VehicleRadarRepositoryImpl): VehicleRadarRepository

    @Binds
    abstract fun bindPriorityDriverService(service: PrioDriverServiceImpl): PrioDriverService

    @Binds
    abstract fun bindFeatureUsageCountService(service: FeatureUsageCountService): FeatureUsageCount

    @Binds
    abstract fun bindPeakTimeService(service: PeakTimeService): IPeakTimeService
}
