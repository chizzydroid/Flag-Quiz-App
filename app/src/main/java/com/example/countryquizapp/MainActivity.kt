package com.example.countryquizapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //this is call the parent constructor
        super.onCreate(savedInstanceState)
       //this is used to align the xml view to this class
        setContentView(R.layout.activity_main)
       
        val btStart: Button = findViewById(R.id.btn_start)
        val editText: EditText = findViewById(R.id.et_name)

        //to hide the status bar.

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

