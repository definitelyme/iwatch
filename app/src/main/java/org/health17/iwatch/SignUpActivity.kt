package org.health17.iwatch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        navigate_signin_button_id.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        signup_button_id.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        facebook_signup_button_id.setOnClickListener {
            Log.d("TAG", "onCreate: Sign up with Facebook")
        }

        google_signup_button_id.setOnClickListener {
            Log.d("TAG", "onCreate: Sign up with Google")
        }
    }
}