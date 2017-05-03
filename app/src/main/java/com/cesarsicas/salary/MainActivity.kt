package com.cesarsicas.salary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.cesarsicas.salary.SalaryCalculator
import com.cesarsicas.salary.R

class MainActivity : AppCompatActivity() {
    var salaryEntity:SalaryEntity?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateSalaryButton = findViewById(R.id.calculateButton) as Button
        val persistDataButton = findViewById(R.id.persistDataButton) as Button

        val salaryEditText = findViewById(R.id.salaryEditText) as EditText
        val dependentsEditText = findViewById(R.id.dependentsEditText) as EditText


        val grossSalaryTextView = findViewById(R.id.grossSalary) as TextView
        val netSalaryTextView = findViewById(R.id.netSalary) as TextView
        val inssDiscountTextView = findViewById(R.id.inssDiscount) as TextView
        val incomeDiscountTextView = findViewById(R.id.incomeDiscount) as TextView
        val dependentsTextView = findViewById(R.id.dependents) as TextView

        calculateSalaryButton.setOnClickListener {
            var grossSalary = salaryEditText.text.toString().toDouble()

            var totalDependents = dependentsEditText.text.toString().toInt()


            val salaryCalculator = SalaryCalculator()

            if(grossSalary != null){

                salaryEntity = salaryCalculator.calculateSalary(grossSalary!!,totalDependents)

                grossSalaryTextView.text = salaryEntity?.grossSalary.toString()
                netSalaryTextView.text = salaryEntity?.netSalary.toString()
                inssDiscountTextView.text = salaryEntity?.inssDiscount.toString()
                incomeDiscountTextView.text = salaryEntity?.incomeDiscount.toString()
                dependentsTextView.text = salaryEntity?.totalDependents.toString()

            }

        }


        persistDataButton.setOnClickListener {
            if(salaryEntity != null){
                SalaryRepository().saveSalary(salaryEntity!!)

            }

        }

    }






}