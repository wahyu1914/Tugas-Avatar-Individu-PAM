package com.example.avatar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.ImageView

class AvatarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avatar)

        val ivHair = findViewById<ImageView>(R.id.ivHair)
        val ivEyes = findViewById<ImageView>(R.id.ivEyes)
        val ivMouth = findViewById<ImageView>(R.id.ivMouth)

        val cbHair = findViewById<CheckBox>(R.id.cbHair)
        val cbEyes = findViewById<CheckBox>(R.id.cbEyes)
        val cbMouth = findViewById<CheckBox>(R.id.cbMouth)

        // default checked
        cbHair.isChecked = true
        cbEyes.isChecked = true
        cbMouth.isChecked = true

        cbHair.setOnCheckedChangeListener { _, isChecked ->
            ivHair.visibility = if (isChecked) android.view.View.VISIBLE else android.view.View.INVISIBLE
        }
        cbEyes.setOnCheckedChangeListener { _, isChecked ->
            ivEyes.visibility = if (isChecked) android.view.View.VISIBLE else android.view.View.INVISIBLE
        }
        cbMouth.setOnCheckedChangeListener { _, isChecked ->
            ivMouth.visibility = if (isChecked) android.view.View.VISIBLE else android.view.View.INVISIBLE
        }
    }
}
