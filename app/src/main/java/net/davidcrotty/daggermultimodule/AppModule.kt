package net.davidcrotty.daggermultimodule

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides fun provide() = AppClass()
}