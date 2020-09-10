package com.example.edittext_dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showEditTextDialog()
    }

    private fun showEditTextDialog() {
        tv_textView.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val inflater :LayoutInflater = layoutInflater
            val dialogLayout: View = inflater.inflate(R.layout.edit_text_layout, null)
            val editText: EditText = dialogLayout.findViewById(R.id.et_editText)

            with(builder) {
                setTitle("Enter a text...")
                setPositiveButton("OK"){ dialog, which ->
                    tv_textView.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){ dialog, which ->
                    Log.d("Main", "Negative button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }
}