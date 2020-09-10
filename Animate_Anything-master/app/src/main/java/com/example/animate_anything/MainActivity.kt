package com.example.animate_anything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_image.setOnClickListener {
            iv_image.animate().apply {
                duration = 1000
                rotationYBy( 360f)
            }.withEndAction {

                iv_image.animate().apply {
                    duration = 1000
                    rotationYBy(3600f)
                }.start()
            }
        }
    }
}