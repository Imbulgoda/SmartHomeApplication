package com.example.nimshara

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use Coroutine to introduce a delay
        GlobalScope.launch {
            delay(3000) // 3-second delay
            val intent = Intent(this@MainActivity, onboard1::class.java)
            startActivity(intent)
            finish() // Close MainActivity after navigating
        }
    }
}
