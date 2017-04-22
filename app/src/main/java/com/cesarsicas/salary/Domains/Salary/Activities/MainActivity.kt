package com.cesarsicas.salary.Domains.Salary.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.cesarsicas.salary.R

class MainActivity : AppCompatActivity() {
    var salary:Double?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateSalaryButton = findViewById(R.id.calculateButton) as Button
        val salaryEditText = findViewById(R.id.salaryEditText) as EditText

        calculateSalaryButton.setOnClickListener {
            this.salary = salaryEditText.text.toString().toDouble()

        }

    }

    public fun calculateSalary(){

    }

    //IR
    public fun calculateIncomeTax(){

    }

    //INSS
    public fun calculateINSS(){

    }

    //other discounts
    public fun calculateDiscounts(){

    }


}
