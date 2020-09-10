package com.example.password_generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordGenerator = PasswordGenerator()

        bt_generate.setOnClickListener {
            val password = passwordGenerator.generatePassword(9, "IceTea")
            tv_text.text = password
        }
    }
}