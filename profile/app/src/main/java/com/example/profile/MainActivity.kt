package com.example.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val clickableViews:List<View> =
            listOf(findViewById(R.id.profile),findViewById(R.id.dp),findViewById(R.id.name),findViewById(R.id.app),findViewById(R.id.team),findViewById(R.id.constrain_layout),findViewById(R.id.red_button),findViewById(R.id.green_button),findViewById(R.id.blue_button))
        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
    fun makeColored(view: View) {

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.profile -> view.setBackgroundResource(R.color.teal_700)//view.setBackgroundColor(Color.DKGRAY)
            R.id.dp -> view.setBackgroundResource(R.color.white) //view.setBackgroundColor(Color.WHITE)


            // Boxes using Android color resources for background-it's not used now
            R.id.name -> view.setBackgroundResource(R.color.name)
            R.id.app -> view.setBackgroundResource(R.color.app)
            R.id.team -> view.setBackgroundResource(R.color.team)

            // Boxes using custom colors for background.
            R.id.red_button -> findViewById<View?>(R.id.name).setBackgroundResource(R.color.my_red)
            R.id.blue_button -> findViewById<View?>(R.id.app).setBackgroundResource(R.color.my_blue)
            R.id.green_button -> findViewById<View?>(R.id.team).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}