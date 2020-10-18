package org.health17.iwatch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    private val navigateSignUpActivity: Button by lazy { -> findViewById(R.id.navigate_signup_button_id) }
    private val emailEditText: TextInputEditText by lazy { -> findViewById(R.id.sign_in_email_editText_id) }
    private val passwordEditText: TextInputEditText by lazy { -> findViewById(R.id.sign_in_password_editText_id) }
    private val loginButton: Button by lazy { -> findViewById(R.id.login_button_id) }
    private val forgotPasswordButton: TextView by lazy { -> findViewById(R.id.sign_in_forgotPassword_id) }
    private val facebookButton: ImageButton by lazy { -> findViewById(R.id.facebook_signin_button_id) }
    private val googleButton: ImageButton by lazy { -> findViewById(R.id.google_signin_button_id) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        navigateSignUpActivity.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            Log.d("TAG", "onCreate: Login as returning User")
        }

        forgotPasswordButton.setOnClickListener {
            Log.d("TAG", "onCreate: OK! I'm gonna help you thru the process")
        }

        facebookButton.setOnClickListener {
            Log.d("TAG", "onCreate: Sign in with Facebook")
        }

        googleButton.setOnClickListener {
            Log.d("TAG", "onCreate: Sign in with Google")
        }
    }
}