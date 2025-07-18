package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homenew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homenew)

        val nextButton2 = findViewById<Button>(R.id.button40)
        nextButton2.setOnClickListener {
            val intent = Intent(this, livingroomnew::class.java)
            startActivity(intent)



        }

        val nextButton = findViewById<Button>(R.id.button41)
        nextButton.setOnClickListener {
            val intent = Intent(this, bedroom::class.java)
            startActivity(intent)

        }
        val nextButton1 = findViewById<Button>(R.id.button42)
        nextButton1.setOnClickListener {
            val intent = Intent(this, kitchen::class.java)
            startActivity(intent)
        }

        val imageButton = findViewById<ImageButton>(R.id.imageButton8)

        imageButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        //notification start
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton3)

        imageButton2.setOnClickListener {
            val intent = Intent(this,notifi::class.java)
            startActivity(intent)
        }

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton4)

        imageButton3.setOnClickListener {
            val intent = Intent(this,search::class.java)
            startActivity(intent)
        }

        //end
    }
}