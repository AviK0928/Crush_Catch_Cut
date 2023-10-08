package com.example.gdsc_rock_paper_scissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Credits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credits)

        val quit = findViewById<Button>(R.id.credit_quit)

        quit.setOnClickListener {
            finishAffinity()
        }
    }
}