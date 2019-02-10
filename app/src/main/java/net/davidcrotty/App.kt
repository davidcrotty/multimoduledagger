package net.davidcrotty

import android.app.Application
import android.content.Intent
import net.davidcrotty.core.*
import net.davidcrotty.profile.ProfileActivity

class App : Application(), CoreComponentProvider, ProfileNavigator {

    override fun onCreate() {
        super.onCreate()
    }

    override fun provideCoreComponent(): CoreComponent {
        return DaggerCoreComponent.builder()
            .networkModule(
                NetworkModule(resources)
            )
            .build()
    }

    override fun navigateToProfile() {
        startActivity(
            Intent(this, ProfileActivity::class.java)
        )
    }
}