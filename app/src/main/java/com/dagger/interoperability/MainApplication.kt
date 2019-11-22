package com.dagger.interoperability

import com.dagger.core.CoreApplication

class MainApplication : CoreApplication() {

    companion object {
        val mainComponent: MainComponent get() = coreComponent as MainComponent
    }

    override fun initializeInjector() {
        coreComponent = DaggerMainComponent.factory().create(this)
            .apply { inject(this@MainApplication) }
    }
}