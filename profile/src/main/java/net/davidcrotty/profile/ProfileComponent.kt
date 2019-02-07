package net.davidcrotty.profile

import dagger.Component
import net.davidcrotty.core.ExpensiveComponent

@Component(dependencies = [ExpensiveComponent::class], modules = [ProfileModule::class])
interface ProfileComponent