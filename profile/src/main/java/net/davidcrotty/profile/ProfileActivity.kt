package net.davidcrotty.profile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.davidcrotty.core.CoreComponentProvider
import javax.inject.Inject

class ProfileActivity : AppCompatActivity() {

    @Inject lateinit var profileViewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        DaggerProfileComponent.builder()
            .coreComponent((application as CoreComponentProvider).provideCoreComponent())
            .profileModule(
                ProfileModule()
            )
            .build()
            .inject(this)
    }
}