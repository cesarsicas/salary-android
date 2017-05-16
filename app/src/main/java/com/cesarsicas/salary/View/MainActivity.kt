package com.cesarsicas.salary.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.cesarsicas.salary.Main.Interfaces.MVP
import com.cesarsicas.salary.Presenter.PresenterImpl
import com.cesarsicas.salary.R
import com.cesarsicas.salary.Main.Entities.SalaryEntity

class MainActivity : AppCompatActivity(), MVP.ViewInterface {


    var grossSalaryTextView:TextView?=null
    var netSalaryTextView:TextView?=null
    var inssDiscountTextView:TextView?=null
    var incomeDiscountTextView:TextView?=null
    var dependentsTextView:TextView?=null
    var calculateSalaryButton:Button?=null
    var persistDataButton:Button?=null
    var salaryEditText:EditText?=null
    var dependentsEditText:EditText?=null
    var presenter:PresenterImpl?=null
    var salaryEntityResult: SalaryEntity?=null


     override fun updateViewsWithValues(salaryEntity: SalaryEntity?):Unit {
        salaryEntityResult = salaryEntity
        grossSalaryTextView?.text = salaryEntity?.grossSalary.toString()
        netSalaryTextView?.text = salaryEntity?.netSalary.toString()
        inssDiscountTextView?.text = salaryEntity?.inssDiscount.toString()
        incomeDiscountTextView?.text = salaryEntity?.incomeDiscount.toString()
        dependentsTextView?.text = salaryEntity?.totalDependents.toString()
    }


    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        grossSalaryTextView =findViewById(R.id.grossSalary) as TextView
        netSalaryTextView =findViewById(R.id.netSalary) as TextView
        inssDiscountTextView =findViewById(R.id.inssDiscount) as TextView
        incomeDiscountTextView =findViewById(R.id.grossSalary) as TextView
        dependentsTextView =findViewById(R.id.dependents) as TextView

        calculateSalaryButton = findViewById(R.id.calculateButton) as Button
        persistDataButton = findViewById(R.id.persistDataButton) as Button
        salaryEditText = findViewById(R.id.salaryEditText) as EditText
        dependentsEditText = findViewById(R.id.dependentsEditText) as EditText


        if(presenter == null){
            presenter = PresenterImpl()
        }

        presenter?.setView(this)

        calculateSalaryButton?.setOnClickListener {

            var grossSalary = salaryEditText?.text.toString().toDouble()
            var totalDependents = dependentsEditText?.text.toString().toInt()

            presenter?.calculateSalary(grossSalary,totalDependents)


        }

        persistDataButton?.setOnClickListener {
            presenter?.addSalary(salaryEntityResult)
        }

    }






}
