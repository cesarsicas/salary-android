package com.cesarsicas.salary

/**
 * Created by julio on 5/3/17.
 */
class SalaryRepository {
    var dao:SugarDatabaseSalaryDao?=null

    constructor()

    constructor(dao: SugarDatabaseSalaryDao){
        this.dao = dao
    }

    public fun saveSalary(salary:SalaryEntity): Boolean {
         return this.dao!!.saveSalary(salary)

    }

    //... other data methods

}