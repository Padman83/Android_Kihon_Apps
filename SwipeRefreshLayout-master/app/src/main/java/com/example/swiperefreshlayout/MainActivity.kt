package com.example.swiperefreshlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        refreshApp()
    }

    private fun refreshApp() {

        swipeToRefresh.setOnRefreshListener {
            Toast.makeText(this, "Page is refreshed", Toast.LENGTH_SHORT).show()
            swipeToRefresh.isRefreshing = false
        }
    }
}
