package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class surelogout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_surelogout)


        val nextButton1 = findViewById<Button>(R.id.button44)
        nextButton1.setOnClickListener {
            val intent = Intent(this, logout::class.java)
            startActivity(intent)

        }
        val nextButton2 = findViewById<Button>(R.id.button45)
        nextButton2.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)

        }
    }
}