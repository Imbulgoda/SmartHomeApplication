package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class kitchen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kitchen)
        val nextButton = findViewById<Button>(R.id.button23)
        nextButton.setOnClickListener {
            val intent = Intent(this, controlswitch::class.java)
            startActivity(intent)

        }

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton)

        imageButton1.setOnClickListener {
            val intent = Intent(this, homenew::class.java)
            startActivity(intent)
        }


        val imageButton2 = findViewById<ImageButton>(R.id.imageButton3)

        imageButton2.setOnClickListener {
            val intent = Intent(this,notifi::class.java)
            startActivity(intent)
        }

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton8)

        imageButton3.setOnClickListener {
            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }

        val imageButton4 = findViewById<ImageButton>(R.id.imageButton4)

        imageButton4.setOnClickListener {
            val intent = Intent(this,search::class.java)
            startActivity(intent)
        }

    }
}