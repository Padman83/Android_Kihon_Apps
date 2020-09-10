package com.example.popup_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popupMenu()
    }

    private fun popupMenu() {
        val popupMenu = PopupMenu(applicationContext, iv_image)
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.nav_share -> {
                    Toast.makeText(applicationContext,"Share pressed", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_flag -> {
                    Toast.makeText(applicationContext,"flag pressed", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_message -> {
                    Toast.makeText(applicationContext,"message pressed", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> true
            }
        }

        iv_image.setOnLongClickListener {

            try {



            val popup = PopupMenu::class.java.getDeclaredField("mPopup")
            popup.isAccessible = true
            val menu = popup.get(popupMenu)
            menu.javaClass
                    .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                    .invoke(menu, true)

           } catch (e: Exception) {
            e.printStackTrace()
           } finally {
               popupMenu.show()
           }

            true
        }
    }
}