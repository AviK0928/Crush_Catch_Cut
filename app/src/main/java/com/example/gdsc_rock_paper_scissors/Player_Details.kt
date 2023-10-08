package com.example.gdsc_rock_paper_scissors

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.vision.text.Text

class Player_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_details)
        val name = findViewById<EditText>(R.id.details_name)
        val btn_next = findViewById<Button>(R.id.details_button)

        btn_next.setOnClickListener {
            val input = name.text.toString()
            if(TextUtils.isEmpty(input)){
            Toast.makeText(this, "Name Cannot be empty", Toast.LENGTH_SHORT).show()
            }
            else{
            val intent = Intent(this, Main_Menu::class.java)
            intent.putExtra("INPUT_TEXT", input)
            startActivity(intent)}
        }

        val quit = findViewById<Button>(R.id.player_quit)

        quit.setOnClickListener {
            finishAffinity()
        }
    }
}
