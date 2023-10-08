package com.example.gdsc_rock_paper_scissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Play_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_screen)

        var score = findViewById<TextView>(R.id.score_play_game)
        var point  = 0


        val rock = findViewById<ImageView>(R.id.rock_icon)
        val scissor = findViewById<ImageView>(R.id.scissor_icon)
        val paper = findViewById<ImageView>(R.id.paper_icon)

        val retry = findViewById<Button>(R.id.play_retry)
        val menu = findViewById<Button>(R.id.play_home)

        val ques_player = findViewById<ImageView>(R.id.player_move)
        val ques_comp = findViewById<ImageView>(R.id.comp_move)

        val result_game = findViewById<TextView>(R.id.result_game)

        val input = intent.getStringExtra("INPUT_TEXT").toString()


        rock.setOnClickListener {
            ques_player.setImageDrawable(rock.drawable)
            val comp = (1..3).random()

            if (comp == 1){
                ques_comp.setImageDrawable(paper.drawable)
                result_game.text = "Computer has Won"
                score.text = "$point"
            } else if (comp == 2){
                ques_comp.setImageDrawable(scissor.drawable)
                result_game.text = "Player has Won"
                point++
                score.text = "$point"
            } else {
                ques_comp.setImageDrawable(rock.drawable)
                result_game.text = "Draw"
                score.text = "$point"
            }
        }

        paper.setOnClickListener {
            ques_player.setImageDrawable(paper.drawable)
            val comp = (1..3).random()

            if (comp == 1){
                ques_comp.setImageDrawable(scissor.drawable)
                result_game.text = "Computer has Won"
                score.text = "$point"
            } else if (comp == 2){
                ques_comp.setImageDrawable(rock.drawable)
                result_game.text = "Player has Won"
                point++
                score.text = "$point"
            } else {
                ques_comp.setImageDrawable(paper.drawable)
                result_game.text = "Draw"
                score.text = "$point"
            }
        }

        scissor.setOnClickListener {
            ques_player.setImageDrawable(scissor.drawable)
            val comp = (1..3).random()

            if (comp == 1){
                ques_comp.setImageDrawable(rock.drawable)
                result_game.text = "Computer has Won"
                score.text = "$point"
            } else if (comp == 2){
                ques_comp.setImageDrawable(paper.drawable)
                result_game.text = "Player has Won"
                point++
                score.text = "$point"
            } else {
                ques_comp.setImageDrawable(scissor.drawable)
                result_game.text = "Draw"
                score.text = "$point"
            }
        }


        retry.setOnClickListener {
            score.text="0"
            point = 0
        }

        var high_score = point

        menu.setOnClickListener {
            val intent = Intent(this, Main_Menu::class.java)
            intent.putExtra("INPUT_TEXT", input)
            startActivity(intent)
        }
    }


}