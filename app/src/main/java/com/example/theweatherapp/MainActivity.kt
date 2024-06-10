package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonWelcome: Button
    private lateinit var buttonExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonWelcome = findViewById(R.id.buttonWelcome)
        buttonExit = findViewById(R.id.buttonExit)

        buttonExit.setOnClickListener {
            finish()
        }

        buttonWelcome.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}