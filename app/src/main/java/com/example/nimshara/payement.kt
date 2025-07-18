package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payement)
        val nextButton = findViewById<Button>(R.id.button24)
        nextButton.setOnClickListener {
            val intent = Intent(this, paymentmethod::class.java)
            startActivity(intent)


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

        }
    }
}