package com.example.slider

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.slider.databinding.FragmentGameBinding


class SecondFragment : Fragment() {
    private lateinit var name1: String
    private lateinit var name2: String
    lateinit  var viewModel: GameViewModel
    lateinit var player1Image: ImageView
    lateinit var player2Image: ImageView
    val argBundle=Bundle()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentGameBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game, container, false
        )
        name1 = arguments?.getString("PLAYER1_NAME")?:"Player1"
        name2 = arguments?.getString("PLAYER1_NAME")?:"Player2"


        Log.i("GameFragment","called ViewModelProvider of!")
        viewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)
        Log.i("Ajith",name1)
        viewModel.player1Name.value=name1
        viewModel.player2Name.value=name2
        binding.playerOneName.text=name1
        binding.playerTwoName.text=name2
        binding.playButton.setOnClickListener {
            if ((viewModel.score1.value)!! <  15&& (viewModel.score2.value)!!<15) {
                viewModel.play()
                player1Image=binding.imageView
                player2Image=binding.imageView2

                val drawableResource1 = when (viewModel.player1Score) {
                    1 -> R.drawable.paper
                    2 -> R.drawable.scissor
                    else -> R.drawable.stone
                }
                player1Image.setImageResource(drawableResource1)
                val drawableResource2 = when (viewModel.player2Score) {
                    1 -> R.drawable.paper
                    2 -> R.drawable.scissor
                    else -> R.drawable.stone
                }
                player2Image.setImageResource(drawableResource2)
            }
            else{
                binding.playButton.text="finish"
                binding.playButton.setOnClickListener {view:View->
                    lateinit var winnerName:String
                    if(viewModel.score1.value!!.toInt()==0){
                        winnerName=viewModel.player1Name.value?:"Player1"
                    }else{
                        winnerName=viewModel.player2Name.value?:"Player2"
                    }
                    argBundle.putString("WINNERS",winnerName)
                    val thirdFragment=ThirdFragment()
                    thirdFragment.arguments=argBundle
                    Log.i("Ajith",argBundle.getString("WINNER").toString())
                    view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
                }
            }

        }
        viewModel.score1.observe(viewLifecycleOwner, Observer {newScore1->
            binding.scoreOne.text=newScore1.toString()
        })
        viewModel.score2.observe(viewLifecycleOwner, Observer { newScore2->
            binding.ScoreTwo.text=newScore2.toString()
        })

        return binding.root
    }

}