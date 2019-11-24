package com.dagger.taxiradar

import com.dagger.core.PerView
import dagger.Module
import dagger.android.ContributesAndroidInjector

//@PerView
//@Component(
//    dependencies = [CoreComponent::class],
//    modules = [RepositoryModule::class, TaxiRadarModule::class]
//)
//
//interface TaxiRadarComponent {
//    fun inject(view: TaxiRadarMapState)
//    fun inject(view: TaxiRadarMenuFragment)
//    fun inject(view: TaxiRadarMapStateRadarBottomSheetMenu)
//}

@Module
abstract class TaxiRadarComponent {

    @PerView
    @ContributesAndroidInjector(modules = [RepositoryModule::class, PresenterModule::class])
    abstract fun bindTaxiRadarFragment(): TaxiRadarMenuFragment

}
