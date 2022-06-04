package com.example.stonescissor

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.stonescissor.databinding.FragmentHomePageBinding


class Game : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("home","Home")
        val binding: FragmentHomePageBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_game,container,false)
        binding.startButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_game2_to_homePage)
        )

        return binding.root
    }
}