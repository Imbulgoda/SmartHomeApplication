package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class newpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_newpassword)
        val nextButton = findViewById<Button>(R.id.button14)
        nextButton.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)

        }
    }
}