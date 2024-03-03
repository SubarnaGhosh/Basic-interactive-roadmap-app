package com.example.interactiveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonIntent = findViewById<Button>(R.id.btnFistPage)
        buttonIntent.setOnClickListener {
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}