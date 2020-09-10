package com.example.optionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_notification -> Toast.makeText(this, "Notification Selected", Toast.LENGTH_SHORT).show()
            R.id.nav_favorite -> Toast.makeText(this, "Favorite Selected", Toast.LENGTH_SHORT).show()
            R.id.nav_rate_review -> Toast.makeText(this, "Rate Review Selected", Toast.LENGTH_SHORT).show()
            R.id.nav_delete -> Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}