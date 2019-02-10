package net.davidcrotty

import android.app.Application
import net.davidcrotty.core.CoreComponent
import net.davidcrotty.core.CoreComponentProvider
import net.davidcrotty.core.DaggerCoreComponent

class App : Application(), CoreComponentProvider {

    override fun onCreate() {
        super.onCreate()
    }

    override fun provideCoreComponent(): CoreComponent {
        return DaggerCoreComponent.builder().build()
    }
}