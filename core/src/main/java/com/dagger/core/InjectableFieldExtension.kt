@file:JvmName("BridgeInjection")

package com.dagger.core

import com.dagger.bridges.Bridge
import kotlin.reflect.KClass

@Suppress("UNCHECKED_CAST")
fun <T: Bridge> inject(kClass: KClass<T>) : T {
    return CoreApplication.coreComponent.bridges.filter { kClass.isInstance(it) }
        .map { it as T }.firstOrNull() ?: throw Exception()
}
