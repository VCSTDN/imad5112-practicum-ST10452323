package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {

    private lateinit var buttonDetailed: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonExit2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        buttonDetailed= findViewById(R.id.buttonDetailed)
        buttonClear= findViewById(R.id.buttonClear)
        buttonExit2= findViewById(R.id.buttonExit2)

        buttonDetailed.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            startActivity(intent)
        }

        buttonExit2.setOnClickListener {
            finish()
        }


    }
}