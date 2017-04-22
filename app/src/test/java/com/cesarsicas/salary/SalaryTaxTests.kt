package com.cesarsicas.salary


import com.cesarsicas.salary.Domains.Salary.Activities.SalaryCalculator

import org.junit.Test

import org.junit.Assert.assertEquals

/**
 * Created by julio on 22/04/17.
 */

class SalaryTaxTests {

    @Test
    fun testCalculateTaxRate() {
        val salaryCalculator = SalaryCalculator()
        assertEquals(7.5, salaryCalculator.calculateTaxRate(), 0.0001)
    }



}
