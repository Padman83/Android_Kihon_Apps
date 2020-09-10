package com.example.custom_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = layoutInflater.inflate(R.layout.custom_toast, ll_wrapper)

        constraint_layout.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                setGravity(Gravity.CENTER, 0, 0)
                view = layout
            }.show()
        }
    }
}