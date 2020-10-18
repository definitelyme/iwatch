package org.health17.iwatch

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SignUpActivity : AppCompatActivity() {
    private val navigateSignInActivity: Button by lazy { -> findViewById(R.id.navigate_signin_button_id) }
    private val emailEditText: TextInputEditText by lazy { -> findViewById(R.id.sign_up_email_editText_id) }
    private val passwordEditText: TextInputEditText by lazy { -> findViewById(R.id.sign_up_password_editText_id) }
    private val signUpButton: Button by lazy { -> findViewById(R.id.signup_button_id) }
    private val facebookButton: ImageButton by lazy { -> findViewById(R.id.facebook_signup_button_id) }
    private val googleButton: ImageButton by lazy { -> findViewById(R.id.google_signup_button_id) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        navigateSignInActivity.setOnClickListener { finish() }

        signUpButton.setOnClickListener {
            Log.d("TAG", "onCreate: Create your free account")
        }

        facebookButton.setOnClickListener {
            Log.d("TAG", "onCreate: Sign up with Facebook")
        }

        googleButton.setOnClickListener {
            Log.d("TAG", "onCreate: Sign up with Google")
        }
    }
}