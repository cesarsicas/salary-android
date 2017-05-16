package com.cesarsicas.salary.Main.Entities

/**
 * Created by julio on 25/04/17.
 */
class SalaryEntity {

    var grossSalary:Double?=null
    var netSalary:Double?=null
    var inssDiscount:Double?=null
    var incomeDiscount:Double?=null
    var totalDependents:Int?=null

    constructor()

    constructor(grossSalary:Double,
                netSalary:Double,
                inssDiscount:Double,
                incomeDiscount:Double,
                totalDependents:Int){

        this.grossSalary = grossSalary
        this.netSalary= netSalary
        this.inssDiscount = inssDiscount
        this.incomeDiscount = incomeDiscount
        this.totalDependents = totalDependents

    }


}