package com.dagger.interoperability

import com.dagger.bridges.RuntimeManipulationServiceBridge
import javax.inject.Inject

class RuntimeManipulationService @Inject constructor() : RuntimeManipulationServiceBridge
