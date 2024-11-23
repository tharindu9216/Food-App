package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) // Ensure this matches your layout file name

        // Initialize the user profile icon and set click listener
        val userProfileButton = findViewById<ImageView>(R.id.imageView11) // Adjust ID if needed
        userProfileButton.setOnClickListener {
            // Create an Intent to start ProfileActivity
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
