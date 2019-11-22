package com.example.network

import android.content.Context
import com.dagger.bridges.NetworkBridge
import com.dagger.core.CoreApplication
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class RetrofitModule @Inject constructor(private val context: CoreApplication) : NetworkBridge {
    override fun call() {
        println("I have the power")
    }


}
