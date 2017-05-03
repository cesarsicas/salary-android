package com.cesarsicas.salary


import com.cesarsicas.salary.SalaryCalculator

import org.junit.Test

import org.junit.Assert.assertEquals

/**
 * Created by julio on 22/04/17.
 */


//imposto de renda
//        Salario                 Aliquota  Parcela a Deduzir
//        De 0 até 1903.98          0,0     0.0     =>     firstSlice
//        De 1.903,99 até 2.826,65	7,5	    142,80  =>     secondSlice
//        De 2.826,66 até 3.751,05	15	    354,80  =>     thirdSlice
//        De 3.751,06 até 4.664,68	22,5	636,13  =>     fourthSlice
//        Above de 4.664,68	        27,5	869,36  =>     fifthSlice



class SalaryIncomeRateTest {


    @Test
    fun taxRateForSalaryFirstSlice() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(0.0, salaryCalculator.calculateIncomeRate(500.0), 0.0001)

    }

    @Test
    fun taxRateForSalarySecondSlice() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(7.5, salaryCalculator.calculateIncomeRate(1903.99), 0.0001)
        assertEquals(7.5, salaryCalculator.calculateIncomeRate(2826.65), 0.0001)
    }

    @Test
    fun taxRateForSalaryThirdSlice() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(15.0, salaryCalculator.calculateIncomeRate(2826.66), 0.0001)
        assertEquals(15.0, salaryCalculator.calculateIncomeRate(3751.05), 0.0001)
    }

    @Test
    fun taxRateForSalaryFourthSlice() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(22.5, salaryCalculator.calculateIncomeRate(3751.06), 0.0001)
        assertEquals(22.5, salaryCalculator.calculateIncomeRate(4664.68), 0.0001)
    }

    @Test
    fun taxRateForSalaryFifthSlice() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(27.5, salaryCalculator.calculateIncomeRate(4664.69), 0.0001)

    }

    @Test
    fun taxRateForSalaryAboveFifthSlice() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(27.5, salaryCalculator.calculateIncomeRate(6664.69), 0.0001)

    }



}
