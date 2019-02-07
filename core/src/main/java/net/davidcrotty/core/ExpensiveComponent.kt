package net.davidcrotty.core

import android.content.res.Resources
import dagger.Component

@Component(modules = [ExpensiveObjectModule::class])
interface ExpensiveComponent {
    fun expose(): ExpensiveObject
    fun resources(): Resources
}