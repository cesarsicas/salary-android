package com.cesarsicas.salary.Model

import com.cesarsicas.salary.Main.Interfaces.MVP
import com.cesarsicas.salary.Main.Interfaces.SalaryDaoInterface
import com.cesarsicas.salary.Main.Entities.SalaryEntity

/**
 * Created by julio on 5/16/17.
 */
class ModelImpl : MVP.ModelInterface {
    var salaryCalculatorImpl:MVP.SalaryCalculatorInterface?=null
    var presenterImpl:MVP.PresenterInterface?=null
    var salaryDao:SalaryDaoInterface?=null


    constructor()

    constructor(presenterImpl:MVP.PresenterInterface, dao:SalaryDaoInterface){
        this.presenterImpl = presenterImpl
        this.salaryCalculatorImpl = SalaryCalculator()
        this.salaryDao = dao

    }

    override fun calculateSalary(salary: Double, numberOfdependents: Int): SalaryEntity? {
        var result = salaryCalculatorImpl?.calculateSalary(salary, numberOfdependents)

        return result
    }


    override fun addSalary(salary: SalaryEntity): Boolean {
        return salaryDao!!.addSalary(salary)
    }

    override fun updateSalary(salary: SalaryEntity): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteSalary(salary: SalaryEntity): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findSalary(id: Int): SalaryEntity {
        return salaryDao!!.findSalary(id)
    }

    override fun listSalary(): List<SalaryEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}