package com.example.textsize_changer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var ourFontSize = 14f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_plus.setOnClickListener {
            ourFontSize += 4f
            tv_text.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize)
        }

        bt_minus.setOnClickListener {
            ourFontSize -= 4f
            tv_text.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize)
        }
    }
}