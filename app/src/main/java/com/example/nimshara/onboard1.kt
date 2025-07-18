package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)


        //Next Button

        val nextButton = findViewById<Button>(R.id.button1)
        nextButton.setOnClickListener {
            val intent = Intent(this, onboard2::class.java)
            startActivity(intent)
            }
    }
}