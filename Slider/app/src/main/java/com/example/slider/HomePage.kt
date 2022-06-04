package com.example.slider

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.slider.databinding.FragmentHomePageBinding

class HomePage : Fragment() {

    val argBundle=Bundle()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentHomePageBinding = DataBindingUtil.inflate(
        inflater,R.layout.fragment_home_page,container,false)

       binding.startButton.setOnClickListener{view:View->
           val playerName:PlayerName


            argBundle.putString("PLAYER1_NAME",binding.player1Name.text.toString())
            argBundle.putString("PLAYER2_NAME",binding.player2Name.text.toString())
            val secondFragment=SecondFragment()
            secondFragment.arguments=argBundle
            Log.i("Ajith",argBundle.getString("PLAYER1_NAME").toString())
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            }
        return binding.root
    }


}