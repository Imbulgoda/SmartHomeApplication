package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loging : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loging)
        val bookButton = findViewById<Button>(R.id.button37)
        bookButton.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }

        val forgotPasswordText = findViewById<TextView>(R.id.textView64)

        forgotPasswordText.setOnClickListener {
            val intent = Intent(this, passwordforgot::class.java) // Navigate to another page
            startActivity(intent)
        }

        val forgotPasswordText1 = findViewById<TextView>(R.id.textView66)

        forgotPasswordText1.setOnClickListener {
            val intent = Intent(this, forgotpassword::class.java) // Navigate to another page
            startActivity(intent)
        }
    }
}