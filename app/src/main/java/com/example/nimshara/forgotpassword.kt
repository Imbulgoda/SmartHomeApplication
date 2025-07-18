package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class forgotpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgotpassword)

        //Book button

        val bookButton = findViewById<Button>(R.id.button10)
        bookButton.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
            }

        val nextButton = findViewById<Button>(R.id.button11)
        nextButton.setOnClickListener {
            val intent = Intent(this, loging::class.java)
            startActivity(intent)

        }

    }
}