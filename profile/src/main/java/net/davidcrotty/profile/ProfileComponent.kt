package net.davidcrotty.profile

import dagger.Component
import net.davidcrotty.core.CoreComponent

@Component(dependencies = [CoreComponent::class], modules = [ProfileModule::class])
interface ProfileComponent {
    fun inject(profileActivity: ProfileActivity)
}