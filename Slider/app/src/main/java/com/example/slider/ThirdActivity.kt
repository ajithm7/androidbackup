package com.example.slider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.slider.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar=supportActionBar
        actionBar!!.title="Third Activity"
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityThirdBinding>(this, R.layout.activity_third)

        binding.thirdActivityPreviousButton.setOnClickListener{
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)}
    }
}