package com.example.st10384980keanobarendsepracticumexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val StudentsName = findViewById<EditText>(R.id.MyName)
        val StudentNumberz = findViewById<EditText>(R.id.MyStudentNumber)









        val Button = findViewById<Button>(R.id.ButtonNext)

        Button.setOnClickListener {
            val intent = Intent (this, Section2::class.java)
            startActivity(intent)
        }




        val Exit1 = findViewById<Button>(R.id.Leave).setOnClickListener { finishAffinity() }
    }


    }
