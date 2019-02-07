package net.davidcrotty.core

import android.content.res.Resources
import android.util.Log

class ExpensiveObject(resources: Resources) {

    private val TAG = "ExpensiveObject"

    init {
        Log.d(TAG, "created")
    }
}