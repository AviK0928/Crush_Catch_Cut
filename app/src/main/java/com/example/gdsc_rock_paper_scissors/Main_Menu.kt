package com.example.gdsc_rock_paper_scissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val input = intent.getStringExtra("INPUT_TEXT").toString()
        val name = findViewById<TextView>(R.id.placeholder_name)
        name.text = input

        val high_score = intent.getIntExtra("HIGH",0)

        val tutorial = findViewById<Button>(R.id.tutorial)

        tutorial.setOnClickListener {
            val input = name.text.toString()
            val intent = Intent(this, Tutorial::class.java)
            intent.putExtra("INPUT_TEXT", input)
            intent.putExtra("HIGH", high_score)
            startActivity(intent)
        }

        val share = findViewById<ImageView>(R.id.share_button)

        share.setOnClickListener {  val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Check out this app!")
            type = "text/plain" }
            startActivity(Intent.createChooser(sendIntent, null))
        }

        val credits = findViewById<Button>(R.id.credits)

        credits.setOnClickListener {
            val intent = Intent(this, Credits::class.java)
            startActivity(intent)
        }

        val quit = findViewById<Button>(R.id.main_quit)

        quit.setOnClickListener {
            finishAffinity()
        }

        val play = findViewById<Button>(R.id.play)

        play.setOnClickListener {
            val intent = Intent(this, Play_Screen::class.java)
            intent.putExtra("INPUT_TEXT", input)
            startActivity(intent)
        }
    }
}