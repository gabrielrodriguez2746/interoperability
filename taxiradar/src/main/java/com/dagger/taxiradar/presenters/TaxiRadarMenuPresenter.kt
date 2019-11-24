package com.dagger.taxiradar.presenters

import com.dagger.taxiradar.peaktime.PeakTimeRepository
import com.dagger.taxiradar.services.PrioDriverService
import com.dagger.taxiradar.vehicleradar.VehicleRadarRepository
import javax.inject.Inject

class TaxiRadarMenuPresenter @Inject constructor(
    private val repo1: PeakTimeRepository,
    private val repo2: PrioDriverService,
    private val repo3: VehicleRadarRepository,
    private val repo4: PrioDriverService
) : TaxiRadarMenuContract.Presenter {

    private lateinit var view: TaxiRadarMenuContract.View

    override fun bind(view: TaxiRadarMenuContract.View) {
        this.view = view
        saySomething()
    }

    private fun saySomething() {
        println("Something")
        view.saying()
    }
}

