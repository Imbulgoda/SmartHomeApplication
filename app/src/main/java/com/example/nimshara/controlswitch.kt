package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class controlswitch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_controlswitch)

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton)

        imageButton1.setOnClickListener {
            val intent = Intent(this, homenew::class.java)
            startActivity(intent)
        }

        val imageButton2 = findViewById<ImageButton>(R.id.imageButton90)

        imageButton2.setOnClickListener {
            val intent = Intent(this, notifi::class.java)
            startActivity(intent)
        }

        val imageButton3= findViewById<ImageButton>(R.id.imageButton92)

        imageButton3.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        val imageButton4 = findViewById<ImageButton>(R.id.imageButton91)

        imageButton4.setOnClickListener {
            val intent = Intent(this,search::class.java)
            startActivity(intent)
        }

    }
}