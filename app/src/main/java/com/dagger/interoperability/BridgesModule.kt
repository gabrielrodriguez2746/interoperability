package com.dagger.interoperability

import com.dagger.bridges.FeatureABridge
import com.dagger.featurea.SomethingA
import dagger.Binds
import dagger.Module

@Module
abstract class BridgesModule {

    @Binds
    abstract fun bindFeatureA(feature: SomethingA) : FeatureABridge

}