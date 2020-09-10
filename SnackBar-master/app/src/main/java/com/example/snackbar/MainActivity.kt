package com.example.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createSnackBar()
    }

    private fun createSnackBar() {

        btn_snackBar.setOnClickListener {
            Snackbar.make(it, "Button clicked", Snackbar.LENGTH_INDEFINITE)
                    .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE)
                    .setBackgroundTint(Color.parseColor("#000000"))
                    .setAction("Action"){
                        Toast.makeText(this,"SnackBar Button Pressed !", Toast.LENGTH_SHORT).show()
                    }.show()
        }
    }
}