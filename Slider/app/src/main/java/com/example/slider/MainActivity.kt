package com.example.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.slider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.title = "Stone & Scissor"
        @Suppress("UNUSED_VARIABLE")
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }

//    override fun pushData(firstPlayerName: String, secondPlayerName: String) {
//        val bundle = Bundle()
//        bundle.putString("PlayerOne", firstPlayerName)
//        bundle.putString("PlayerTwo", secondPlayerName)
//        val  transaction = this.supportFragmentManager.beginTransaction()
//        val secondFragment = SecondFragment()
//        secondFragment.arguments = bundle
//transaction.replace(R.id.myNavHostFragment,secondFragment)
//    }
}