package net.davidcrotty.core

import android.content.ComponentName
import android.content.Intent
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
            // airbnb say its possible to do this :s
            // need context from profile

            // could use deep linking / feature modules this is recommended practice
            // https://stackoverflow.com/questions/51035892/how-can-i-access-an-activity-from-another-feature-module
            // how does this affect shared element transitions?

//            val intent = Intent()
//            intent.setClassName("net.davidcrotty.profile", "ProfileActivity")

//            val intent = Intent("net.davidcrotty.profile.ProfileActivity")

//            val compIntent = Intent()
//            val comp = ComponentName("net.davidcrotty.profile", "net.davidcrotty.profile.ProfileActivity")
//            compIntent.setComponent(comp)

//            startActivity(
//                compIntent
//                intent
//                Intent(applicationContext, Class.forName("net.davidcrotty.profile.ProfileActivity").javaClass)
//            )

            val navigator = application as ProfileNavigator
            navigator.navigateToProfile()
        }
    }
}