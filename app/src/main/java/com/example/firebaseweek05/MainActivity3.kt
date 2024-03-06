package com.example.firebaseweek05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firebaseweek05.R.id.result_tv

class MainActivity3 : AppCompatActivity() , View.OnClickListener {

    lateinit var  btnADD: Button
    lateinit var  btnSub: Button
    lateinit var  btnMultipy: Button
    lateinit var  btnDivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnADD = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMultipy = findViewById(R.id.btn_mutiplication)
        btnDivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnADD.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultipy.setOnClickListener(this)
        btnDivision.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result : Double = 0.0

        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_subtraction ->{
                result = a-b
            }
            R.id.btn_mutiplication ->{
                result = a*b

            }
            R.id.btn_division ->{
                result = a/b
            }
        }

        resultTv.text = "Result is $result"
    }


}
