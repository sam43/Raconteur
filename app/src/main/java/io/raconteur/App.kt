package io.raconteur

import android.app.Application
import io.raconteur.core.di.coreModule
import io.raconteur.data.di.dataModule
import io.raconteur.domain.di.domainModule
import io.raconteur.presentation.di.appPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    private val listOfModules = listOf(
        coreModule,
        dataModule,
        domainModule,
        appPresentationModule
    )
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(level = Level.INFO)
            androidContext(this@App)
            modules(listOfModules)
        }
    }
}
