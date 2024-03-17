package com.example.pro_omr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn = findViewById<ImageButton>(R.id.ImgLogin)
        loginBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val registerBtn = findViewById<ImageButton>(R.id.ImgRegister)
        registerBtn.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }
}