package com.github.context

import android.app.Application
import android.content.Context

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val myContext: Context = this
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}