package com.dagger.featurea

import com.dagger.bridges.FeatureABridge
import javax.inject.Inject

class SomethingA @Inject constructor() : FeatureABridge {
    override val featureMesaage: String = "I am feature A"
}