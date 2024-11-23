package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Ensure this references the correct layout

        // Find views by ID
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val loginButton: Button = findViewById(R.id.buttonLogin)
        val signupButton: Button = findViewById(R.id.buttonSignup)

        // Set up login button click listener
        loginButton.setOnClickListener {
            // Handle login logic here (e.g., check credentials)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Close LoginActivity so the user can't navigate back to it
        }

        // Set up signup button click listener
        signupButton.setOnClickListener {
            // Navigate to SignupActivity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
