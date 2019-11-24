package com.dagger.core

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

abstract class CoreApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        initializeInjector()
        super.onCreate()
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    abstract fun initializeInjector()

    companion object {
        lateinit var coreComponent: CoreComponent
    }

}
