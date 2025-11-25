package io.raconteur

import android.app.Application
import io.raconteur.core.di.coreModule
import io.raconteur.data.di.dataModule
import io.raconteur.domain.di.domainModule
import io.raconteur.presentation.di.appPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(coreModule, dataModule, domainModule, appPresentationModule)
        }
    }
}
