package com.example.slider

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GameViewModel : ViewModel() {
    var player1Name= MutableLiveData<String>()
    var player2Name= MutableLiveData<String>()

    var player1Score:Int=0
    var player2Score:Int=0


    var score1 = MutableLiveData<Int>()
    var score2 = MutableLiveData<Int>()
    init{
        Log.i("Ajith","viewmodel called")
        score1.value=0
        score2.value=0
    }
fun play(){
    Log.i("Ajith","play called")
    player1Score=Random.nextInt(1,4)
    player2Score=Random.nextInt(1,4)
    if(player1Score>player2Score){
        score1.value=(score1.value)?.plus(1)
    }else if(player1Score<player2Score){
        score2.value=(score2.value)?.plus(1)
    }else{
       /* score1.value=(score1.value)?.plus(1)
        score2.value=(score2.value)?.plus(1)*/
    }
}

}

