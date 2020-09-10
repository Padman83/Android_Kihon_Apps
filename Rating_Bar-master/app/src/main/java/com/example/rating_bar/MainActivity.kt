package com.example.rating_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        rb_ratingBar.rating = 2.5f
        rb_ratingBar.stepSize = .5f

        rb_ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->

            Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
        }
    }
}