package com.dagger.interoperability

import com.dagger.bridges.LoginServiceBridge
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginService @Inject constructor() : LoginServiceBridge
