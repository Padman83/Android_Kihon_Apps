package com.example.autocomplete_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries = resources.getStringArray(R.array.countries_array)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        autocomplete_country.setAdapter(adapter)

    }
}