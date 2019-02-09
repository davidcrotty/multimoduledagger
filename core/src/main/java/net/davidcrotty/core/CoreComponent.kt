package net.davidcrotty.core

import android.content.res.Resources
import dagger.Component

@Component(modules = [NetworkModule::class])
interface CoreComponent {
    fun expose(): NetworkRepository
    fun resources(): Resources
}