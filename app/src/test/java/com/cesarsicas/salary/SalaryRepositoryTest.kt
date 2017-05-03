package com.cesarsicas.salary

import org.junit.Test
import org.mockito.Mockito

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

        // verificando que o método foi invocado
        Mockito.verify(dao).saveSalary(salary)

    }
}