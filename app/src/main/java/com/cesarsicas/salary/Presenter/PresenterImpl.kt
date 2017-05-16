package com.cesarsicas.salary.Presenter

import com.cesarsicas.salary.Main.Interfaces.MVP
import com.cesarsicas.salary.Model.ModelImpl
import com.cesarsicas.salary.Main.Entities.SalaryEntity
import com.cesarsicas.salary.Model.SugarSalaryDaoImpl


class PresenterImpl : MVP.PresenterInterface {


    var modelImpl: MVP.ModelInterface? = null
    var viewImpl: MVP.ViewInterface? = null

    constructor(){
        this.modelImpl = ModelImpl(this, SugarSalaryDaoImpl())
    }


    override fun setView(view: MVP.ViewInterface) {
        this.viewImpl = view
    }


    override fun calculateSalary(salary: Double, numberOfdependents: Int) {
        if((salary !=0.0 && numberOfdependents >= 0)){
            val result = modelImpl?.calculateSalary(salary, numberOfdependents) ?: SalaryEntity()

            updateViewsWithValues(result)
        }
        else{
            updateViewsWithValues(SalaryEntity())

        }

    }

    fun updateViewsWithValues(salaryEntity: SalaryEntity?){
        this.viewImpl?.updateViewsWithValues(salaryEntity)

    }


    override fun addSalary(salaryEntity: SalaryEntity?): Boolean {
        if(salaryEntity!=null){
            this.modelImpl?.addSalary(salaryEntity)
            this.viewImpl?.showToast("Salvo com sucesso !")

            return true
        }
        else{
            return false
        }
    }

    //@ToDo make other CRUD methods
    //...

}