package com.example.avatar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvFull = findViewById<TextView>(R.id.tvFullName)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        val prefs = getSharedPreferences("avatar_prefs", MODE_PRIVATE)
        val first = prefs.getString("firstName", "")
        val last = prefs.getString("lastName", "")
        val email = prefs.getString("email", "")

        tvFull.text = "$first $last"
        tvEmail.text = email

        btnLogout.setOnClickListener {
            // clear session-ish data if needed
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        // click profile to open avatar screen for editing
        tvFull.setOnClickListener {
            startActivity(Intent(this, AvatarActivity::class.java))
        }
    }
}
