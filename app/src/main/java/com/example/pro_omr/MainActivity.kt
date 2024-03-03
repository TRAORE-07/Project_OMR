package com.example.pro_omr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton = findViewById<ImageButton>(R.id.ImgLogin)
        imageButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val imageButton2 = findViewById<ImageButton>(R.id.ImgRegister)
        imageButton2.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }
}