package com.example.countryquizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class resultActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvUserName : TextView = findViewById(R.id.tv_User_name)
        val tvScore : TextView = findViewById(R.id.tv_Score)
         val btnFinish: Button = findViewById(R.id.btn_finish)
           tvUserName.text = intent.getStringExtra(Constants.USER_NAME)



        val  totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
             val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
              tvScore.text = "You Score $correctAnswers Over $totalQuestions"

           btnFinish.setOnClickListener {
             startActivity(Intent(this,MainActivity::class.java))
           }

         }

         }
