package org.health17.iwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        notifications_card.setOnClickListener {
            startActivity(Intent(this, NotificationSettingsActivity::class.java))
        }

        personal_info_card.setOnClickListener {
            startActivity(Intent(this, PersonalInfoActivity::class.java))
        }
    }
}