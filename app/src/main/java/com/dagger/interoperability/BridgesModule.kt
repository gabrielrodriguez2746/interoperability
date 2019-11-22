package com.dagger.interoperability

import com.dagger.bridges.FeatureABridge
import com.dagger.bridges.NetworkBridge
import com.dagger.featurea.SomethingA
import com.example.network.RetrofitModule
import dagger.Binds
import dagger.Module

@Module
abstract class BridgesModule {

    @Binds
    abstract fun bindFeatureA(feature: SomethingA) : FeatureABridge

    @Binds
    abstract fun bindNetwork(network: RetrofitModule) : NetworkBridge

}
