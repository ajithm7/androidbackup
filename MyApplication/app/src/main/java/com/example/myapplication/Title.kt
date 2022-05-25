package com.example.myapplication

import android.os.Bundle
import android.support.v4.media.session.MediaSessionCompat.Token.fromBundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person.fromBundle
import androidx.databinding.DataBindingUtil
import androidx.media.AudioAttributesCompat.fromBundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentTitleBinding

class Title : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentTitleBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)
//        binding.startButton.setOnClickListener { view:View ->
//            view.findNavController().navigate(R.id.action_title2_to_gameFragment)
//        }
        //var args=GameFragment.fromBundle(arguments)
        val bundle = Bundle()
        val player1=binding.player1Name
        val player2=binding.player2Name
        bundle.putString("Player_One",player1.toString() )
        bundle.putString("Player_Two",player2.toString())

        binding.startButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_title2_to_gameFragment,bundle))
        return binding.root
    }

}