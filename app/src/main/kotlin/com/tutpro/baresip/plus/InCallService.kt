package com.tutpro.baresip.plus

import android.app.Service
import android.content.Intent
import android.os.IBinder

// This is needed in order to allow choosing baresip as default Phone app

class InCallService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}