package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
/*import android.widget.TextView*/
/*import android.widget.Toast*/
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val rollButton:Button=findViewById(R.id.rll_button)
        rollButton.setOnClickListener{
        rollDice()
        //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            }
        diceImage=findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val drawableResource = when (Random.nextInt(1,7)) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }

        diceImage.setImageResource(drawableResource)

        /*val resultNumber:TextView=findViewById(R.id.result_number)
        val randomNum = Random.nextInt(1,7)
        resultNumber.text = randomNum.toString()*/
    /*resultNumber.text = "dice rolled"*/
    }
}