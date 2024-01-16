package com.pradeep.demoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MoviesApplication : Application() {
    override fun onCreate() {
        super.onCreate()

    }

}