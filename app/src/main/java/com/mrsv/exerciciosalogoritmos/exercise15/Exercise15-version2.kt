package com.mrsv.exerciciosalogoritmos.exercise15

import com.mrsv.exerciciosalogoritmos.exercise15.PrintMessages.Companion.salary
import com.mrsv.exerciciosalogoritmos.exercise15.PrintMessages.Companion.workedDays
import com.mrsv.exerciciosalogoritmos.exercise15.PrintMessages.Companion.workedHoursInOneDay

/**
 *  15) Create a program that reads the number os worked days in a months and that shows the
 *  employee's salary. It is known that the employee works 8 hours a day and earns US$ 25
 *  per worked hour.
 */

fun main() {
    while (workedDays <= 0) {
        PrintMessages().showQuestionHowManyDaysWorked()
    }
}

class PrintMessages() {

    companion object {
        var salary = 0.0
        var workedDays = -1
        val workedHoursInOneDay = 8 * 25
    }

    fun showQuestionHowManyDaysWorked() {
        println("How many days has the employee worked this month?")
        ValidationNumberOFWorkedDays().validateNumberOFWorkedDays()
    }

    fun showEmployeeSalary() {
        println("The employee's salary in this month is US$ $salary")
    }
}

class WorkedDays() {
    fun readsTheNumberOfDaysWorked() {
        workedDays = readln().toInt()
    }
}

class ValidationNumberOFWorkedDays() {
    fun validateNumberOFWorkedDays() {
        var key = true
        while (key) {
            try {
                WorkedDays().readsTheNumberOfDaysWorked()
                key = false
            } catch (e: NumberFormatException) {
                println("\nYou've inserted an invalided input.\nPlease, try again!")
            }
        }

        if (workedDays <= 0) {
            println("\nYou've inserted an invalided input.\nPlease, try again!")
        } else {
            MakeCalculations().calculateEmployeeSalary(workedDays, workedHoursInOneDay)
            PrintMessages().showEmployeeSalary()
        }
    }
}

class MakeCalculations() {
    fun calculateEmployeeSalary(workedDays: Int, workedHoursInOneDay: Int) {
        salary = workedDays * workedHoursInOneDay.toDouble()
    }
}