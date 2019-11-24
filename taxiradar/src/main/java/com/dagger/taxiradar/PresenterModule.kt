package com.dagger.taxiradar

import com.dagger.taxiradar.presenters.TaxiRadarMenuContract
import com.dagger.taxiradar.presenters.TaxiRadarMenuPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class PresenterModule {

    @Binds
    abstract fun bindPresenter(taxiRadarMenuPresenter: TaxiRadarMenuPresenter): TaxiRadarMenuContract.Presenter

}
