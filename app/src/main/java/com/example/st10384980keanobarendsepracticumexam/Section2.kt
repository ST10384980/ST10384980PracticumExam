package com.example.st10384980keanobarendsepracticumexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Section2 : AppCompatActivity() {




    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section2)


         val DayWeather = findViewById<EditText>(R.id.DailyWeather)
         val MinWeather = findViewById<EditText>(R.id.Min)
         val MaxText = findViewById<EditText>(R.id.Max)
         val WeatherText = findViewById<EditText>(R.id.WeatherCondition)




        val PleaseExit = findViewById<Button>(R.id.Leaving)
        PleaseExit.setOnClickListener { finishAffinity() }




        val CleanButton = findViewById<Button>(R.id.CleanBtn)
            CleanButton.setOnClickListener{

                DayWeather.text.clear()
                MinWeather.text.clear()
                MaxText.text.clear()
                WeatherText.text.clear() }










        val FinalButton = findViewById<Button>(R.id.NextMatch)
        FinalButton.setOnClickListener {
            val intent = Intent(this, Section3::class.java)
            startActivity(intent)
        }

        }



    }




