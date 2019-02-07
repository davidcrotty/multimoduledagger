package net.davidcrotty.core

import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class ExpensiveObjectModule(private val resources: Resources) {
    @Provides fun provideModule() = ExpensiveObject(resources)
    @Provides fun provideResources() = resources
}