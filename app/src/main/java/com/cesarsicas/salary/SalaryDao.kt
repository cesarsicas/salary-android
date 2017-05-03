package com.cesarsicas.salary

/**
 * Created by julio on 5/3/17.
 */
interface SalaryDao {
    public fun addSalary(salary:SalaryEntity):Boolean

    public fun saveSalary(salary:SalaryEntity):Boolean

    public fun deleteSalary(salary:SalaryEntity):Boolean

    public fun findSalary(id:Int):SalaryEntity

    public fun listSalary():List<SalaryEntity>

}