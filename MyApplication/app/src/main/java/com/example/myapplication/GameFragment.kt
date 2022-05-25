package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentGameBinding

class GameFragment : Fragment() {
      var scoreOne:Int=0
     var scoreTwo:Int=0
     lateinit var viewModel: GameViewModel
     lateinit var player1Image: ImageView
    lateinit var player2Image: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding:FragmentGameBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_game,container,false)
        val name1=arguments?.getString("Player_One")
        val name2=arguments?.getString("Player_Two")
        player1Image=binding.imageView3
        player2Image=binding.imageView2
        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)
        val bundle = Bundle()
        lateinit var winner:String

        binding.playButton.setOnClickListener{
            if(scoreOne<scoreTwo)
                winner=name2.toString()
            else
                winner=name1.toString()

            if(scoreOne<=10&&scoreTwo<=10){
                viewModel.playing()
                var image1=when(viewModel.imageOne){
                    1 -> R.drawable.paperpng
                    2 -> R.drawable.scissorpng
                    else -> R.drawable.stonepng
                }
                player1Image.setImageResource(image1)
                var image2=when(viewModel.imageTwo){
                    1 -> R.drawable.paperpng
                    2 -> R.drawable.scissorpng
                    else -> R.drawable.stonepng
                }
                player2Image.setImageResource(image2)
            }
            else{
                bundle.putString("Player_Winner",winner )
                binding.playButton.text="Finish"
                binding.playButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameFragment_to_scoreFragment,bundle))
            }

        }


       return binding.root
          }
}