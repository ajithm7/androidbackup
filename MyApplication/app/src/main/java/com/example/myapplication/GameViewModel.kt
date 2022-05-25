package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random


class GameViewModel: ViewModel() {
    var scoreOne= MutableLiveData<Int>()
    var scoreTwo=MutableLiveData<Int>()
    var playerOneName=MutableLiveData<String>()
    var playerTwoName=MutableLiveData<String>()
    var imageOne=0
    var imageTwo=0
    init{
        scoreOne.value=0
        scoreTwo.value=0
    }
    fun playing(){
         imageOne= Random.nextInt(1,4)
         imageTwo=Random.nextInt(1,4)
        if(imageOne>imageTwo){
            scoreOne.value=scoreOne.value?.plus(1)
        }else if(imageTwo>imageOne){
            scoreTwo.value=scoreTwo.value?.plus(1)
        }
    }

}