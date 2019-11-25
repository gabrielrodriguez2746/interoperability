package com.dagger.core

import com.dagger.bridges.Bridge
import dagger.android.AndroidInjector

interface CoreComponent : AndroidInjector<CoreApplication> {

    val bridges : Set<Bridge>

}
