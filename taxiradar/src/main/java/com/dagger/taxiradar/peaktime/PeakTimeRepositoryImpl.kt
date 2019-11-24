package com.dagger.taxiradar.peaktime

import com.dagger.taxiradar.services.IPeakTimeService
import javax.inject.Inject

class PeakTimeRepositoryImpl @Inject constructor(private val peakTimeService: IPeakTimeService) :
    PeakTimeRepository

