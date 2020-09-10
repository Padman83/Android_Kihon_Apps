package com.example.random_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateRandomNumber: Button = findViewById(R.id.button)
        generateRandomNumber.setOnClickListener { randomNumber() }
    }

    private fun randomNumber() {
        /* Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() */
        val randomInt = (1..100).random()
        result_text.text = randomInt.toString()
    }
}