package com.dagger.featureb

import com.dagger.bridges.FeatureABridge
import com.dagger.bridges.NetworkBridge
import javax.inject.Inject

class IAmB @Inject constructor(private val feature: FeatureABridge, private val networkBridge: NetworkBridge) {

    fun print() = "${feature.featureMesaage} in b"

    fun printNetwork() = networkBridge.call()
}
