package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvAnswer= findViewById<TextView>(R.id.tvAnswer)
        var etFirstNum= findViewById<EditText>(R.id.etFirstNum)
        var etSecondNum= findViewById<EditText>(R.id.etSecondNum)
        var btnAdditon= findViewById<Button>(R.id.btnAddition)
        var btnMinus= findViewById<Button>(R.id.btnMinus)
        var btnMultiplation= findViewById<Button>(R.id.btnMultiplication)
        var btnModulus= findViewById<Button>(R.id.btnModulus)

        btnAdditon.setOnClickListener {
            if(etFirstNum.text.toString().equals("") || etSecondNum.text.toString().equals("")){
                Toast.makeText(baseContext, "Pass Number", Toast.LENGTH_LONG).show()
            }
            else{
                var num1= etFirstNum.text.toString().toInt()
                var num2= etSecondNum.text.toString().toInt()
                var result= num1 + num2
                tvAnswer.text=("Answer $result")
            }
        }
        btnMinus.setOnClickListener {
            if(etFirstNum.text.toString().equals("") || etSecondNum.text.toString().equals("")){
                Toast.makeText(baseContext, "Pass Number", Toast.LENGTH_LONG).show()
        }
            else{
                var num1= etFirstNum.text.toString().toInt()
                var num2= etSecondNum.text.toString().toInt()
                var result= num1 - num2
                tvAnswer.text=("Answer $result")
            }
            btnMultiplation.setOnClickListener {
                if(etFirstNum.text.toString().equals("") || etSecondNum.text.toString().equals("")){
                    Toast.makeText(baseContext,"Pass Number",Toast.LENGTH_LONG).show()
                }
                else{
                    var num1= etFirstNum.text.toString().toInt()
                    var num2= etSecondNum.text.toString().toInt()
                    var result= num1 * num2
                    tvAnswer.text=("Answer $result")
                }
                btnModulus.setOnClickListener {
                    if (etFirstNum.text.toString().equals("") || etSecondNum.text.toString().equals("")){
                        Toast.makeText(baseContext,"Pass Number",Toast.LENGTH_LONG).show()
                    }
                    else{
                        var num1= etFirstNum.text.toString().toInt()
                        var num2= etSecondNum.text.toString().toInt()
                        var result= num1 % num2
                        tvAnswer.text=("Answer $result")

                    }
                }
            }
    }
}
}