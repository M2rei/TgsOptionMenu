package com.example.tgsoptionmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.tgsoptionmenu.databinding.ActivityHomePageBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name3 = intent.getStringExtra("PASSING_NAME")

        with(binding){
            nama.text = name3
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_logout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_logout -> {
                val intenLogout = Intent(this, MainActivity::class.java)
                startActivity(intenLogout)
                finish()
                true
            }else -> super.onOptionsItemSelected(item)
        }
    }
}

