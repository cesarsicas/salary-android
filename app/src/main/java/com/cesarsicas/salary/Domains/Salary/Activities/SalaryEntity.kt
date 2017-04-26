package com.cesarsicas.salary.Domains.Salary.Activities

/**
 * Created by julio on 25/04/17.
 */
class SalaryEntity {

    var grossSalary:Double?=null
    var netSalary:Double?=null
    var inssDiscount:Double?=null
    var incomeDiscont:Double?=null
    var totalDependents:Int?=null

    constructor()

    constructor(grossSalary:Double,
                netSalary:Double,
                inssDiscount:Double,
                incomeDiscont:Double,
                totalDependents:Int){

        this.grossSalary = grossSalary
        this.netSalary= netSalary
        this.inssDiscount = inssDiscount
        this.incomeDiscont = incomeDiscont
        this.totalDependents = totalDependents

    }


}