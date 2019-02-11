package net.davidcrotty.core

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Fully qualified name ${MainActivity::class.java.canonicalName}")

        launch_profile.setOnClickListener {
            val navigator = application as Navigator
            navigator.navigateToProfile()
        }
    }
}