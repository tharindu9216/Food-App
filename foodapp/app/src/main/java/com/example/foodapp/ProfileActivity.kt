package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Find the logout button by its ID
        val logoutButton = findViewById<Button>(R.id.buttonLogout)
        logoutButton.setOnClickListener {
            // Create an Intent to start HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

            // Optional: Finish ProfileActivity so it is removed from the back stack
            finish()
        }
    }
}
