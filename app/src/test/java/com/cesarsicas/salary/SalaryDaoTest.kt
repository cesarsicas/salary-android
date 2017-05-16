package com.cesarsicas.salary

import com.cesarsicas.salary.Main.Entities.SalaryEntity
import com.cesarsicas.salary.Model.ModelImpl
import com.cesarsicas.salary.Model.SugarSalaryDaoImpl
import com.cesarsicas.salary.Presenter.PresenterImpl
import junit.framework.Assert
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`

/**
 * Created by julio on 5/3/17.
 */
class SalaryDaoTest {

//
//    //verifica se save foi chamado
//
    @Test
    public fun testSaveSalary(){
        val salary = SalaryEntity(5000.00, 4084.88, 550.0,365.12, 0)

        var dao = Mockito.mock(SugarSalaryDaoImpl::class.java)

        var model = ModelImpl(PresenterImpl(),dao)

        model.addSalary(salary)

        // verify if the method was called
        Mockito.verify(dao).addSalary(salary)
    }


    @Test
    public fun testFindSalary(){
        val salary = SalaryEntity(5000.00, 4084.88, 550.0, 365.12, 0)

        var dao = Mockito.mock(SugarSalaryDaoImpl::class.java)

        var model = ModelImpl(PresenterImpl(),dao)

        `when`(dao.findSalary(1)).thenReturn(salary)



        var returned = model.findSalary(1)


        //verify if the method was called
        Mockito.verify(dao).findSalary(1)

        //verify the value of returned object
        Assert.assertEquals(5000.00, returned.grossSalary)
    }
}