package net.davidcrotty.profile

import dagger.Module
import dagger.Provides

@Module
class ProfileModule {
    @Provides fun provide() = ProfileClass()
}