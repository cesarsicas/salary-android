package com.cesarsicas.salary

import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`

/**
 * Created by julio on 5/3/17.
 */
class SalaryRepositoryTest {


    //verifica se save foi chamado

    @Test
    public fun testSaveSalary(){
        val salary = SalaryEntity(5000.00, 4084.88, 550.0,365.12, 0)

        var dao = Mockito.mock(SugarDatabaseSalaryDao::class.java)

        SalaryRepository(dao).saveSalary(salary)

        // verify if the method was called
        Mockito.verify(dao).saveSalary(salary)
    }


    @Test
    public fun testFindSalary(){
        val salary = SalaryEntity(5000.00, 4084.88, 550.0, 365.12, 0)

        var dao = Mockito.mock(SugarDatabaseSalaryDao::class.java)

        `when`(dao.findSalary(1)).thenReturn(salary)

        var returned = SalaryRepository(dao).findSalary(1)


        //verify if the method was called
        Mockito.verify(dao).findSalary(1)

        //verify the value of returned object
        Assert.assertEquals(5000.00, returned.grossSalary)
    }
}