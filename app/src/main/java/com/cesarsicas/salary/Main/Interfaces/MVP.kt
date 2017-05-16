package com.cesarsicas.salary.Main.Interfaces

import com.cesarsicas.salary.Main.Entities.SalaryEntity


interface MVP {
    interface SalaryCalculatorInterface{

        fun calculateSalary(salary: Double, numberOfdependents: Int): SalaryEntity

        fun calculateIncomeRate(salary:Double): Double

        fun calculateIncomeDeduction(salary:Double): Double

        fun calculateIncomeDiscount(salary:Double, incomeRate:Double,
                                            incomeDeduction:Double): Double
        fun calculateInssRate(salary:Double): Double

        fun calculateInssDiscount(salary:Double, inssRate:Double): Double

        fun calculateDependentsDiscount(numberOfdependents:Int): Double


    }

    interface ModelInterface{
        fun calculateSalary(salary: Double, numberOfdependents: Int): SalaryEntity?
        fun addSalary(salary: SalaryEntity):Boolean
        fun updateSalary(salary: SalaryEntity):Boolean
        fun deleteSalary(salary: SalaryEntity):Boolean
        fun findSalary(id:Int): SalaryEntity
        fun listSalary():List<SalaryEntity>

    }


    interface ViewInterface{
        fun updateViewsWithValues(salaryEntity: SalaryEntity?):Unit
        fun showToast(message: String):Unit
    }


    interface PresenterInterface{
        fun calculateSalary(salary: Double, numberOfdependents: Int)
        fun addSalary(salaryEntity: SalaryEntity?): Boolean
        fun setView(view: MVP.ViewInterface)

    }





}