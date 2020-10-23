package org.health17.iwatch

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_password_reset.*

class PasswordResetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset)

        view_pager.adapter = TabAdapter(this, supportFragmentManager)
        tab_layout.setupWithViewPager(view_pager)

        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, VerificationActivity::class.java)
            startActivity(intent)
        }
    }
}