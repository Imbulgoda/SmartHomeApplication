package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val nextButton = findViewById<Button>(R.id.button5)
        nextButton.setOnClickListener {
            val intent = Intent(this, myprofile::class.java)
            startActivity(intent)

        }

        val nextButton5 = findViewById<Button>(R.id.button7)
        nextButton5.setOnClickListener {
            val intent = Intent(this, payement::class.java)
            startActivity(intent)

        }

        val nextButton1 = findViewById<Button>(R.id.button6)
        nextButton1.setOnClickListener {
            val intent = Intent(this, surelogout::class.java)
            startActivity(intent)

        }
        val nextButton2 = findViewById<Button>(R.id.button10)
        nextButton2.setOnClickListener {
            val intent = Intent(this, history::class.java)
            startActivity(intent)

        }

        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
            val intent = Intent(this, homenew::class.java)
            startActivity(intent)


        }
        //profile
        val imageButton1 = findViewById<ImageButton>(R.id.imageButton99)

        imageButton.setOnClickListener {
            val intent = Intent(this, homenew::class.java)
            startActivity(intent)
        }

        //notification start
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton98)

        imageButton2.setOnClickListener {
            val intent = Intent(this,notifi::class.java)
            startActivity(intent)
        }






    }
}