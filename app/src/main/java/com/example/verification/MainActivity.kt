package com.example.verification

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.SpannableStringBuilder
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.bold
import androidx.databinding.DataBindingUtil
import com.example.verification.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        var email: String = "ajithkumarsrce@gmail.com"
//        var message ="Verification mail has been sent to \b$email. Please verify your email address to continue using Zoho Assist. For more details , read our"
        val messageOne = "Verification mail has been sent to "
        val messageTwo =
            ". Please verify your email address to continue using Zoho Assist.\n For more details , read our"
        val s = SpannableStringBuilder()
            .append(messageOne)
            .bold { append(email) }
            .append(messageTwo)
        binding.verificationMessageText.setText(s)

    }

}