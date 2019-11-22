package com.dagger.featureb

import com.dagger.bridges.FeatureABridge
import javax.inject.Inject

class IAmB @Inject constructor(private val feature: FeatureABridge) {

    fun print() = "${feature.featureMesaage} in b"
}