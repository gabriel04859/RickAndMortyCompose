package com.grfsa.rickandmortycompose.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                modules = listOf(
                    apiModule,
                    repositoriesModule,
                    useCasesModule,
                    viewModelsModule
                )
            )
        }
    }
}