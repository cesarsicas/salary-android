package com.cesarsicas.salary

/**
 * Created by julio on 5/3/17.
 */
class SugarDatabaseSalaryDao : SalaryDao {
    override fun addSalary(salary: SalaryEntity): Boolean {
        return true
    }

    override fun saveSalary(salary: SalaryEntity): Boolean {
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