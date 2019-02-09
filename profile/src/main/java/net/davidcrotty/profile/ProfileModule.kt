package net.davidcrotty.profile

import dagger.Module
import dagger.Provides
import net.davidcrotty.core.NetworkRepository

@Module
class ProfileModule {
    @Provides fun provide(repo: NetworkRepository) = ProfileViewModel(repo)
}