package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Find views by ID
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val signupButton: Button = findViewById(R.id.buttonSignup)

        // Set up signup button click listener
        signupButton.setOnClickListener {
            // Handle signup logic here (e.g., save user details)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Close SignupActivity so the user can't navigate back to it
        }
    }
}