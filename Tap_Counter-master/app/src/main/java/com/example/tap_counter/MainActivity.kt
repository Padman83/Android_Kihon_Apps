package com.example.tap_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initialize and assign the variable.
    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        value.text = "" + id

        plusBtn.setOnClickListener() {
            value.text = "" + ++id
        }

        minusBtn.setOnClickListener() {
            value.text = "" + --id
        }
    }
}