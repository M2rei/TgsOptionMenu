package com.example.tgsoptionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.tgsoptionmenu.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        var EXTRA_NAME = "extra_name"
        var EXTRA_EMAIL = "email"
        var EXTRA_PHONE = "phone"
        var EXTRA_PASSWORD = "password"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = TabAdapter(this@MainActivity)
            TabLayoutMediator(tabLayout,viewPager){ tab, position ->
                tab.text =  when (position){
                    0 -> "Login"
                    1 -> "Register"
                    else -> ""
                }
            }.attach()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId){
//            R.id.action_Login -> {
//                Toast.makeText(this@MainActivity, "Login", Toast.LENGTH_SHORT).show()
//                true
//            }
//            R.id.action_register -> {
//                Toast.makeText(this@MainActivity, "Register", Toast.LENGTH_SHORT).show()
//                true
//            }
//            else -> {super.onOptionsItemSelected(item)}
//        }
//    }
}