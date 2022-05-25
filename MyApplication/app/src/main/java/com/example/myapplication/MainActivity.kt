package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Ajith","On Creat")
        @Suppress("UNUSED_VARIABLE")
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

    }
}