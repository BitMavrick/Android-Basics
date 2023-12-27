package com.github.foregroundservices

import android.app.Service
import android.content.Intent
import android.os.IBinder

class RunningService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when(intent?.action){
            Actions.START.toString() -> start()
            Actions.STOP.toString() -> stopSelf()
        }

        return super.onStartCommand(intent, flags, startId)
    }

    private fun start(){



    }

    enum class Actions {
        START,
        STOP
    }
}