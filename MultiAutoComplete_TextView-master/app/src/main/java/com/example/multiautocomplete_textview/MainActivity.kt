package com.example.multiautocomplete_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val item = listOf<String>("Classic Trance", "Melodic Techno", "Space Ambient", "Classic Rock", "Chill Lounge", "House", "Country", "Old-School Rap")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, item)
        tv_multiAutoCompete.setAdapter(adapter)
        tv_multiAutoCompete.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
    }
}