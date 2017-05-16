package com.cesarsicas.salary.Interfaces

import com.cesarsicas.salary.SalaryEntity


interface MVP {
    interface ModelImpl{

        public fun calculateSalary(salary: Double, numberOfdependents: Int): SalaryEntity

        public fun calculateIncomeRate(salary:Double): Double

        public fun calculateIncomeDeduction(salary:Double): Double

        public fun calculateIncomeDiscount(salary:Double, incomeRate:Double,
                                            incomeDeduction:Double): Double

        public fun calculateInssRate(salary:Double): Double

        public fun calculateInssDiscount(salary:Double, inssRate:Double): Double

        public fun calculateDependentsDiscount(numberOfdependents:Int): Double


    }



}