package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf<String>(
                "Egg",
                "Avocado",
                "Milk",
                "Sweet Potato",
                "Brown Sugar"
        )

        val arrayAdapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                items
        )

        listView.adapter = arrayAdapter
    }
}