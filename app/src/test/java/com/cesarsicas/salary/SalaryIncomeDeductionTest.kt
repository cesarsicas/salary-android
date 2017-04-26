package com.cesarsicas.salary


import com.cesarsicas.salary.Domains.Salary.Activities.SalaryCalculator

import org.junit.Test

import org.junit.Assert.assertEquals




//imposto de renda
//        Salario                 Aliquota  Parcela a Deduzir
//        De 0 até 1903.98          0,0     0.0     =>     firstSlice
//        De 1.903,99 até 2.826,65	7,5	    142,80  =>     secondSlice
//        De 2.826,66 até 3.751,05	15	    354,80  =>     thirdSlice
//        De 3.751,06 até 4.664,68	22,5	636,13  =>     fourthSlice
//        Above de 4.664,68	        27,5	869,36  =>     fifthSlice

class SalaryIncomeDeductionTest {


    @Test
    fun salaryIncomeTaxFirstSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(0.0, salaryCalculator.calculateIncomeDeduction(1000.0), 0.0001)

    }

    @Test
    fun salaryIncomeTaxSecondSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(142.80, salaryCalculator.calculateIncomeDeduction(2000.0), 0.0001)

    }

    @Test
    fun salaryIncomeTaxThirdSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(354.80 , salaryCalculator.calculateIncomeDeduction(3000.0), 0.0001)

    }

    @Test
    fun salaryIncomeForthSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(636.13, salaryCalculator.calculateIncomeDeduction(4000.0), 0.0001)

    }

    @Test
    fun salaryIncomeTaxFifthSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(869.36, salaryCalculator.calculateIncomeDeduction(5000.0), 0.0001)

    }



}
