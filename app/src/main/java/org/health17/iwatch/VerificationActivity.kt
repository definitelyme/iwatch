package org.health17.iwatch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_verification.*

class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        setSupportActionBar(verification_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        verification_toolbar.setNavigationOnClickListener { finish() }
    }
}