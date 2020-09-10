package com.example.navigation_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpNavigationDrawer()
    }

    private fun setUpNavigationDrawer() {
        toggle = ActionBarDrawerToggle(this, dl_drawer_layout, R.string.open, R.string.closed)
        dl_drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nv_navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> Toast.makeText(this,"Home clicked", Toast.LENGTH_SHORT).show()
                R.id.nav_help -> Toast.makeText(this, "Help clicked", Toast.LENGTH_SHORT).show()
                R.id.nav_search -> Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
                R.id.nav_settings -> Toast.makeText(this,"Settings clicked", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}