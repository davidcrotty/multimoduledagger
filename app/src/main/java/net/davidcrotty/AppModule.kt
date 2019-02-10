package net.davidcrotty

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides fun provide() = AppClass()
}