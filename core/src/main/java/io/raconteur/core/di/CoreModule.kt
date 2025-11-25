package io.raconteur.core.di

import io.raconteur.core.dispatcher.DefaultDispatcherProvider
import io.raconteur.core.dispatcher.DispatcherProvider
import org.koin.dsl.module

val coreModule = module {
    single<DispatcherProvider> { DefaultDispatcherProvider() }
}

