package com.example.countryquizapp

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

        val btStart: Button = findViewById(R.id.btn_start)
        val editText: EditText = findViewById(R.id.et_name)



        btStart.setOnClickListener {
            if (editText.text.isEmpty()) {
                Toast.makeText(this, "please enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuestionActivity::class.java)
               intent.putExtra(Constants.USER_NAME,editText.text.toString())
                startActivity(intent)
                  finish()
            }
        }
    }
}

