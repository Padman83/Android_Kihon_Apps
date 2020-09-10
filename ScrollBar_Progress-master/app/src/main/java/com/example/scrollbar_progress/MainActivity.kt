package com.example.scrollbar_progress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sv_wrapper.setOnScrollChangeListener { view, scrollX, scrollY, oldScrollX, oldScrollY ->

            val totalScrollLength = sv_wrapper.getChildAt(0 ).height - sv_wrapper.height

            progressBar.apply {
                max = totalScrollLength
                progress = scrollY
            }
        }
    }
}