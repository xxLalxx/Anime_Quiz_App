package com.example.animequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class ThirdActivity : AppCompatActivity() {

    private lateinit var op1 : RadioButton
    private lateinit var op2 : RadioButton
    private lateinit var op3 : RadioButton
    private lateinit var op4 : RadioButton
    private lateinit var sub : Button
    private  var score : Int = 0

    private var ans : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        op1 = findViewById(R.id.radioButton5)
        op2 = findViewById(R.id.radioButton6)
        op3 = findViewById(R.id.radioButton7)
        op4 = findViewById(R.id.radioButton8)
        var intent1 = getIntent()
        score = intent1.getIntExtra("score",0)

        sub = findViewById(R.id.button2)

        initListeners()
    }

    fun initListeners(){

        op1.setOnClickListener(){
            ans = op1.text.toString()
        }

        op2.setOnClickListener(){
            ans = op2.text.toString()
        }

        op3.setOnClickListener(){
            ans = op3.text.toString()
        }

        op4.setOnClickListener(){
            ans = op4.text.toString()
        }

        sub.setOnClickListener(){

            if(ans == op3.text.toString()){
                score = score + 10
            }
            var intent =Intent(this,FourthActivity::class.java)
            intent.putExtra("score",score)
            startActivity(intent)
        }

    }
}