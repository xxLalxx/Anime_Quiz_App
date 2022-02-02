package com.example.animequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EndActivity : AppCompatActivity() {

    private lateinit var scoreboard : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        scoreboard = findViewById(R.id.textView10)
        var intent1 = getIntent()



        scoreboard.text = intent1.getStringExtra("score")


        var btn1: Button = findViewById(R.id.buttonredo)
        var intent: Intent = Intent(this , MainActivity::class.java)
        btn1.setOnClickListener{
            startActivity(intent);
        }

        var btn2: Button = findViewById(R.id.exit)
        btn2.setOnClickListener{
           finishAffinity()

        }
    }
}