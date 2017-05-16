package com.cesarsicas.salary

import com.cesarsicas.salary.Model.SalaryCalculator
import org.junit.Test
import org.junit.Assert.assertEquals


//Salário de Contribuição (R$)	Alíquota
//De R$ 937,00 a R$ 1.659,38	    8%   => First Slice
//De R$ 1.659,39 a R$ 2.765,66	    9%   => Second Slice
//De R$ 2.765,67 até R$ 5.531,31	11%  => Third Slice
//acima de R$ 5.531,31	            11%  => Fourth Slice

class SalaryInssDiscountTest {



    @Test
    fun salaryInssDiscountFirstSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(80.0, salaryCalculator.calculateInssDiscount(1000.0, 8.0 ), 0.0001)

    }

    @Test
    fun salaryInssDiscountSecondSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(180.0, salaryCalculator.calculateInssDiscount(2000.0, 9.0 ), 0.0001)

    }

    @Test
    fun salaryInssDiscountThirdSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(330.0, salaryCalculator.calculateInssDiscount(3000.0, 11.0 ), 0.0001)

    }

    @Test
    fun salaryInssDiscountFourthSlice() {
        val salaryCalculator = SalaryCalculator()

        assertEquals(608.44, salaryCalculator.calculateInssDiscount(6000.0, 11.0 ), 0.01)

    }


}