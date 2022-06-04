package com.example.slider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.slider.databinding.ActivityMainBinding
import com.example.slider.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar=supportActionBar
        actionBar!!.title="Second Activity"
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivitySecondBinding>(this, R.layout.activity_second)
        binding.secondActivityNextButton.setOnClickListener{
            val intent= Intent(this,ThirdActivity::class.java)
            startActivity(intent)}

        binding.secondActivityPreviousButton.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)}
    }


}