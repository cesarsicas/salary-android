package com.cesarsicas.salary.Model

import com.cesarsicas.salary.Main.Interfaces.SalaryDaoInterface
import com.cesarsicas.salary.Main.Entities.SalaryEntity

class SugarSalaryDaoImpl : SalaryDaoInterface {
    override fun addSalary(salary: SalaryEntity): Boolean {
        return true
    }

    override fun updateSalary(salary: SalaryEntity): Boolean {
        return true
    }

    override fun deleteSalary(salary: SalaryEntity): Boolean {
        return true
    }

    override fun findSalary(id: Int): SalaryEntity {
        return SalaryEntity()
    }

    override fun listSalary(): List<SalaryEntity> {
        return listOf(SalaryEntity())
    }


}