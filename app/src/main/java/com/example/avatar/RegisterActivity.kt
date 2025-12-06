package com.example.avatar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etFirst = findViewById<EditText>(R.id.etFirstName)
        val etLast = findViewById<EditText>(R.id.etLastName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etUser = findViewById<EditText>(R.id.etUsernameReg)
        val etPass = findViewById<EditText>(R.id.etPasswordReg)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etCity = findViewById<EditText>(R.id.etCity)
        val etBirthday = findViewById<EditText>(R.id.etBirthday)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val first = etFirst.text.toString()
            val last = etLast.text.toString()
            val email = etEmail.text.toString()
            val user = etUser.text.toString()
            val pass = etPass.text.toString()

            if (first.isEmpty() || last.isEmpty() || email.isEmpty() || user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill required fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val prefs = getSharedPreferences("avatar_prefs", MODE_PRIVATE)
            prefs.edit().apply {
                putString("firstName", first)
                putString("lastName", last)
                putString("email", email)
                putString("username", user)
                putString("password", pass)
                putString("phone", etPhone.text.toString())
                putString("city", etCity.text.toString())
                putString("birthday", etBirthday.text.toString())
                apply()
            }

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
            // go back to login
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
