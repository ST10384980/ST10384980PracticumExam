package com.example.st10384980keanobarendsepracticumexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Section3 : AppCompatActivity() {




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section3)








        val Return = findViewById<Button>(R.id.BackButton)

        Return.setOnClickListener {
            val intent = Intent (this, Section2::class.java)
            startActivity(intent)
        }


    }
}