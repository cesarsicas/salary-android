package com.cesarsicas.salary.Main.Interfaces

import com.cesarsicas.salary.Main.Entities.SalaryEntity

/**
 * Created by julio on 5/3/17.
 */
interface SalaryDaoInterface {
    public fun addSalary(salary: SalaryEntity):Boolean

    public fun updateSalary(salary: SalaryEntity):Boolean

    public fun deleteSalary(salary: SalaryEntity):Boolean

    public fun findSalary(id:Int): SalaryEntity

    public fun listSalary():List<SalaryEntity>

}