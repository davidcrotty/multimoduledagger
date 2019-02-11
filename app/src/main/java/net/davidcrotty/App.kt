package net.davidcrotty

import android.app.Application
import android.content.Intent
import net.davidcrotty.core.*
import net.davidcrotty.core.feed.FeedActivity
import net.davidcrotty.profile.ProfileActivity

class App : Application(), CoreComponentProvider, Navigator {

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

    override fun navigateToFeed() {
        startActivity(
            Intent(this, FeedActivity::class.java)
        )
    }
}