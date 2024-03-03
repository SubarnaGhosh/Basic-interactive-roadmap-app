package com.example.interactiveapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val android = findViewById<CardView>(R.id.card1)
        val web = findViewById<CardView>(R.id.card2)
        val ml = findViewById<CardView>(R.id.card3)
        val devops = findViewById<CardView>(R.id.card4)
        val blck = findViewById<CardView>(R.id.card5)
        val game = findViewById<CardView>(R.id.card6)

        android.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/android")
            startActivity(intent)
        }
        web.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/full-stack")
            startActivity(intent)
        }
        ml.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/ai-data-scientist")
            startActivity(intent)
        }
        devops.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/devops")
            startActivity(intent)
        }
        blck.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/blockchain")
            startActivity(intent)
        }
        game.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/game-developer")
            startActivity(intent)
        }

    }
}