package com.mrsv.exerciciosalogoritmos.exercise19

import com.mrsv.exerciciosalogoritmos.exercise19.Program.Companion.average
import com.mrsv.exerciciosalogoritmos.exercise19.Program.Companion.exitProgramKey
import com.mrsv.exerciciosalogoritmos.exercise19.Program.Companion.grades
import com.mrsv.exerciciosalogoritmos.exercise19.Program.Companion.newGrade
import com.mrsv.exerciciosalogoritmos.exercise19.Program.Companion.numberOfGrades
import kotlin.properties.Delegates

/**
 *  19) Create an algorithm that reads the name and two grades of a student, calculates his/her
 *  average and shows it on the screen. In the end, analise the average and say if the student
 *  succeeded or not. (The student will succeed if his/her average is at least 7.0)
 */

// TODO: e se forem n notas?

fun main() {
    var key = true
    while (key) {
        println("How many grades are there?")
        try {
            numberOfGrades = readln().toInt()
            key = false
        } catch (e: NumberFormatException) {
            println("You've inserted wrong data.\n")
        }
    }

    if (numberOfGrades > 0) {
        for (i in 1..numberOfGrades) {
            // VALIDAÇÃO DA NOTA
            // NOTA MÍNIMA = 0
            // NOTA MÁXIMA = 10

            var key4 = true

            while (key4) {
                println("What is the grade number $i?")
                try {
                    newGrade = readln().toDouble()
                    if (newGrade < 0 || newGrade > 10) {
                        println("You've inserted an invalid grade.\n")
                    } else {
                        grades.add(newGrade)
                        key4 = false
                    }
                } catch (e: NumberFormatException) {
                    println("You've typed invalid data. ")
                }
            }
        }

        // MOSTRAR O RESULTADO DA MÉDIA

        average = grades.average()
        println(grades.average())

        if (average >= 7) println("Succeed") else println("Failed")

        // VALIDAÇÃO NOTA NEGATIVA OU IGUAL A ZERO
    } else {
        println("You've inserted wrong data.\n")
    }
    var key3 = true
    while (key3) {
        println(
            "\nWould you like to calculate new averages?\n" +
                "Press y to continue. Press any other key to exit."

        )
        exitProgramKey = readln()

        if (exitProgramKey == "y" || exitProgramKey == "Y") {
            key3 = false
        }
    }
}

class Program() {

    companion object {
        var numberOfGrades = -1
        var grades = mutableListOf<Double>()
        var average = -1.0
        var newGrade by Delegates.notNull<Double>()

        // lateinit var result: Result
        var exitProgramKey = "y"
    }

    fun fillTheListWithGrades() {
    }
}
//
// class PrintMessages() {
//    fun showMessageHowManyGrades() {
//
//    }
//
//    fun showMessageWhatIsTheGrade(i: Int) {
//
//
//    }
//
//    fun showMessageStudentAverageAndResult() {
// //        println("The student's average is $avgerage -> $result")
//    }
// }
//
// enum class Result {
//    SUCCEEDED, FAILED
// }
//
// class Calculations() {
//
//    fun calculateAverage() {
//    }
//
// //
// //    media = (nota1 + nota2) / 2
//
//    if (media >= 7.0) {
//
//    } else {
//
//    }
// }
