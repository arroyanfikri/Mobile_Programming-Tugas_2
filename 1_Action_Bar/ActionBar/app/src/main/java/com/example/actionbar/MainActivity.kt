package com.example.actionbar

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

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_item, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.account -> {
                Toast.makeText(this, "Account", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.about -> {
                Toast.makeText(this, "About", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.setting -> {
                Toast.makeText(this, "Setting", Toast.LENGTH_LONG).show()
                return true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}