package org.health17.iwatch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_password_reset.*

class PasswordResetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset)

        setSupportActionBar(password_reset_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        password_reset_toolbar.setNavigationOnClickListener { finish() }

        password_reset_viewpager.adapter = TabAdapter(this, supportFragmentManager)
        password_reset_tabLayout.setupWithViewPager(password_reset_viewpager)

    }
}