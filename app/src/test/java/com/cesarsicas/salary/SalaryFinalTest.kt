package com.cesarsicas.salary


import com.cesarsicas.salary.Model.SalaryCalculator

import org.junit.Test

import org.junit.Assert.assertEquals

/**
 * Created by julio on 22/04/17.
 */


class SalaryFinalTest {


    @Test
    fun salaryFinalTestCenaryA() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(1820.00, salaryCalculator.calculateSalary(2000.0,0).netSalary!!, 0.0001)

    }

    @Test
    fun salaryFinalTestCenaryB() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(1380.0, salaryCalculator.calculateSalary(1500.0 , 0).netSalary!!, 0.0001)

    }




}
