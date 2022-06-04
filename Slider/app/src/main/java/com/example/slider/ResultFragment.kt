package com.example.slider

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.slider.databinding.FragmentResultBinding


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentResultBinding = DataBindingUtil.inflate(
        inflater,R.layout.fragment_result,container,false)
        val winner:String=arguments?.getString("WINNER")?:"You"
        binding.thirdFragmentTitle.text="$winner won the match"
        return binding.root
    }

}