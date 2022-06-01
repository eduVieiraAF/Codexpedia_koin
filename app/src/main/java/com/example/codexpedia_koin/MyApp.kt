package com.example.codexpedia_koin

import android.app.Application
import com.example.codexpedia_koin.data.di.networkModule
import com.example.codexpedia_koin.data.di.repositoryModule
import com.example.codexpedia_koin.data.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp: Application() {
    private val appModules = listOf(
        repositoryModule,
        networkModule,
        vmModule
    )

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(appModules)
        }
    }
}