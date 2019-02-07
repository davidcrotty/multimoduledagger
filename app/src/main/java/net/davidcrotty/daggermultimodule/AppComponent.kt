package net.davidcrotty.daggermultimodule

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent