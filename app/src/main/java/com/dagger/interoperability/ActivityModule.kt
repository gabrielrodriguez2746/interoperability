package com.dagger.interoperability

import com.dagger.taxiradar.TaxiRadarComponent
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [TaxiRadarComponent::class]) // Is not longer a component
    abstract fun bindMainActivity() : MapActivity

}
