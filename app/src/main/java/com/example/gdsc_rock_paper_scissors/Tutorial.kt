package com.example.gdsc_rock_paper_scissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)
        val input = intent.getStringExtra("INPUT_TEXT").toString()
        val name = findViewById<TextView>(R.id.player_name_high_score)
        name.text = input

    }
}