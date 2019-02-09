package net.davidcrotty.core

import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class NetworkModule(private val resources: Resources) {
    @Provides fun provideModule() = NetworkRepository(resources)
    @Provides fun provideResources() = resources
}