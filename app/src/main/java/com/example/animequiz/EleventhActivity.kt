package com.example.animequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class EleventhActivity : AppCompatActivity() {

    private lateinit var op1: RadioButton
    private lateinit var op2: RadioButton
    private lateinit var op3: RadioButton
    private lateinit var op4: RadioButton
    private lateinit var sub: Button
    private  var score : Int = 0
    private var ans: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleventh)

        op1 = findViewById(R.id.radioButton37)
        op2 = findViewById(R.id.radioButton38)
        op3 = findViewById(R.id.radioButton39)
        op4 = findViewById(R.id.radioButton40)
        var intent1 = getIntent()
        score = intent1.getIntExtra("score",0)

        sub = findViewById(R.id.button10)

        initListeners()
    }

    fun initListeners() {

        op1.setOnClickListener() {
            ans = op1.text.toString()
        }

        op2.setOnClickListener() {
            ans = op2.text.toString()
        }

        op3.setOnClickListener() {
            ans = op3.text.toString()
        }

        op4.setOnClickListener() {
            ans = op4.text.toString()
        }

        sub.setOnClickListener() {

            if (ans == op4.text.toString()) {
                score = score + 10
            }
            var intent = Intent(this, EndActivity::class.java)
            intent.putExtra("score", score.toString())
            startActivity(intent)
        }
    }
}