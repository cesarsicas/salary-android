package com.cesarsicas.salary

import com.cesarsicas.salary.Domains.Salary.Activities.SalaryCalculator
import org.junit.Test
import org.junit.Assert.assertEquals


//Salário de Contribuição (R$)	Alíquota
//De R$ 937,00 a R$ 1.659,38	    8%   => First Slice
//De R$ 1.659,39 a R$ 2.765,66	    9%   => Second Slice
//De R$ 2.765,67 até R$ 5.531,31	11%  => Third Slice

class SalaryInssRateTest {



    @Test
    fun salaryIncomeFirstSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(8.0, salaryCalculator.calculateInssRate(1000.0), 0.0001)

    }

    @Test
    fun salaryIncomeSecondSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(9.0, salaryCalculator.calculateInssRate(2000.0), 0.0001)

    }

    @Test
    fun salaryIncomeThirdSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(11.0, salaryCalculator.calculateInssRate(3000.0), 0.0001)

    }

}