package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreen : AppCompatActivity() {

    private lateinit var textviewAverageDisplay: TextView
    private lateinit var buttonDetailed: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonExit2: Button
    private lateinit var buttonCalculate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        buttonDetailed = findViewById(R.id.buttonDetailed)
        buttonClear = findViewById(R.id.buttonClear)
        buttonExit2 = findViewById(R.id.buttonExit2)

        buttonDetailed.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            startActivity(intent)
        }

        buttonExit2.setOnClickListener {
            finish()
        }

        buttonClear.setOnClickListener {
            textviewAverageDisplay.text = ""
        }

            fun main() {
                val numbers = listOf(12, 15, 13, 12, 11, 10, 10, 25, 29, 27, 26, 23, 18, 16)
                return
            }
    }
}