package org.health17.iwatch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        navigate_signup_button_id.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        login_button_id.setOnClickListener {
            Log.d("TAG", "onCreate: Login as returning User")
        }

        sign_in_forgotPassword_id.setOnClickListener {
            Log.d("TAG", "onCreate: OK! I'm gonna help you thru the process")
        }

        facebook_signin_button_id.setOnClickListener {
            Log.d("TAG", "onCreate: Sign in with Facebook")
        }

        google_signin_button_id.setOnClickListener {
            Log.d("TAG", "onCreate: Sign in with Google")
        }
    }
}