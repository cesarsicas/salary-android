package com.cesarsicas.salary.Domains.Salary.Activities

/**
 * Created by julio on 22/04/17.
 */
class SalaryCalculator {
    val dependentsDiscount = 199.07

    constructor(){

    }

    public fun calculateSalary(salary: Double, numberOfdependents: Int): Double {

        val inssRate = calculateInssRate(salary)
        val salaryDiscountedInss = salary - calculateInssDiscount(salary, inssRate)
        val salaryDiscountedDependents = salaryDiscountedInss - calculateDependentsDiscount(numberOfdependents)

        //val incomeRate = calculateIncomeRate(salaryDiscountedDependents)
        val incomeDiscount = calculateIncomeDiscount(salaryDiscountedDependents)
        val finalSalary = salaryDiscountedInss - incomeDiscount

        return finalSalary


    }

    //used only for the companies, not necessary for salary calc
    public fun calculateIncomeRate(salary:Double): Double {

        when (salary) {
            in 0.0     .. 1903.98 -> return  0.0
            in 1903.99 .. 2826.65 -> return  7.5
            in 2826.66 .. 3751.05 -> return  15.0
            in 3751.06 .. 4664.68 -> return  22.5

            else -> {
                if(salary > 4664.68){
                 return  27.5
                }
                return Double.NEGATIVE_INFINITY
            }
        }

    }

    public fun calculateIncomeDiscount(salary:Double): Double {
        when (salary) {
            in 0.0     .. 1903.98 -> return  0.0
            in 1903.99 .. 2826.65 -> return  142.80
            in 2826.66 .. 3751.05 -> return  354.80
            in 3751.06 .. 4664.68 -> return  636.13

            else -> {
                if(salary > 4664.68){
                    return  869.36
                }
                return Double.NEGATIVE_INFINITY
            }
        }
    }

    //INSS
    public fun calculateInssRate(salary:Double): Double {
        when (salary) {
            in 937.00     .. 1659.38 -> return  8.0
            in 1659.39 .. 2765.66 -> return  9.0
            in 2765.67 .. 5531.31 -> return  11.0


            else -> {
                if(salary > 5531.31){
                    return 11.0
                }

                return Double.NEGATIVE_INFINITY
            }
        }

    }

    //INSS discount
    public fun calculateInssDiscount(salary:Double, inssRate:Double): Double {
        return  if(salary < 5531.31) (salary*inssRate)/100 else (5531.31)*11/100

    }

    public fun calculateDependentsDiscount(numberOfdependents:Int): Double {
        return this.dependentsDiscount * numberOfdependents

    }
}