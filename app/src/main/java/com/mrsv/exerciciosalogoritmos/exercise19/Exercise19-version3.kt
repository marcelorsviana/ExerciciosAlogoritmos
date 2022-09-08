package com.mrsv.exerciciosalogoritmos.exercise19

.Companion.result

import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.amountOfGrades
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.average
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.newAverageLoopQuestion
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.grades
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.InsertNewGrade
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.ValidateAmountOfGrades
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.newGrade
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.repeatProgram
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.result
import com.mrsv.exerciciosalogoritmos.exercise19.Companion.result.ProgramExercise19.Companion.stringAverage
import kotlin.properties.Delegates

/**
 *  19) Create an algorithm that reads the name and two grades of a student, calculates his/her
 *  average and shows it on the screen. In the end, analise the average and say if the student
 *  succeeded or not. (The student will succeed if his/her average is at least 7.0)
 */

// TODO: and if there were n grades?

fun main() {
    ProgramExercise19().startProgramCalculateAverage()
}


class ProgramExercise19() {

    companion object {
        var amountOfGrades = -1
        var grades = mutableListOf<Double>()
        var average = -1.0
        var stringAverage = ""
        var result: String = ""
        var newGrade by Delegates.notNull<Double>()
        var ValidateAmountOfGrades = true
        var InsertNewGrade = true
        var newAverageLoopQuestion = true
        var repeatProgram = true
    }

    fun resetVariables() {
        newAverageLoopQuestion = true
        ValidateAmountOfGrades = true
        repeatProgram = true
    }

    fun startProgramCalculateAverage() {
        while (repeatProgram) {
            ProgramExercise19().resetVariables()
            Validations().validateAmountOfGradesInserted()
            Validations().validateGrade()
            Calculations().calculateAverage()
            Calculations().checkResult()
            PrintMessages().showMessageStudentAverageAndResult()
            Validations().validateExit()
        }
    }

}

class PrintMessages() {
    fun showMessageCalculateNewAverage() {
        println(
            "\nWould you like to calculate new averages?\n" +
                    "Press 1 to continue. Press 2 to exit."
        )
    }

    fun showMessageGradeNotAllowed() {
        println(
            "The grade you've inserted is not allowed.\n" +
                    "Please, insert a grade between zero and 10.\n"
        )
    }

    fun showMessageHowManyGrades() {
        println("How many grades are there?")
    }

    fun showMessageInCaseInvalidCharacterIsInserted() {
        PrintMessages().showMessageYouHaveInsertedSomethingWrong()
        PrintMessages().showMessagePleaseTryAgain()
    }

    fun showMessageMinimumNumberOfGrades() {
        println("You should insert at least 2 grades.")
    }

    fun showMessageNotValidTryAgain() {
        println("Not valid!")
        PrintMessages().showMessagePleaseTryAgain()
    }

    fun showMessagePleaseTryAgain() {
        println("Please try again.\n")
    }

    fun showMessageStudentAverageAndResult() {
        println("The student's average is $stringAverage -> $result")
    }

    fun showMessageStudentHasFailed(): String = "The student has failed!"

    fun showMessageStudentHasSucceeded(): String = "The student has succeeded!"

    fun showMessageWhatIsGradeNumberI(i: Int) {
        println("What is the grade number $i?")
    }

    fun showMessageYouHaveInsertedSomethingWrong() {
        println("You've inserted something wrong.")
    }
}

class Validations() {

    // QUANTITY OF GRADES TO BE INSERTED VALIDATION
    // THE MINIMUM NUMBER OF GRADES MUST BE GREATER OR EQUAL TO 2
    // THERE IS NO LIMIT TO THE NUMBER OF GRADES

    fun validateAmountOfGradesInserted() {
        while (ValidateAmountOfGrades) {
            PrintMessages().showMessageHowManyGrades()
            try {
                amountOfGrades = readln().toInt()
                if (amountOfGrades >= 2) {
                    ValidateAmountOfGrades = false
                } else {
                    PrintMessages().showMessageMinimumNumberOfGrades()
                    PrintMessages().showMessagePleaseTryAgain()
                }
            } catch (e: NumberFormatException) {
                PrintMessages().showMessageInCaseInvalidCharacterIsInserted()
            }
        }
    }

    // GRADE VALIDATION
    // MINIMUM GRADE = 0
    // MAXIMUM GRADE = 10

    fun validateGrade() {
        for (i in 1..amountOfGrades) {
            InsertNewGrade = true

            while (InsertNewGrade) {
                PrintMessages().showMessageWhatIsGradeNumberI(i)
                try {
                    newGrade = readln().toDouble()
                    if (newGrade < 0 || newGrade > 10) {
                        PrintMessages().showMessageGradeNotAllowed()
                    } else {
                        grades.add(newGrade)
                        InsertNewGrade = false
                    }
                } catch (e: NumberFormatException) {
                    PrintMessages().showMessageInCaseInvalidCharacterIsInserted()
                }
            }
        }
    }

    fun validateExit() {
        while (newAverageLoopQuestion) {

            PrintMessages().showMessageCalculateNewAverage()

            try {
                when (readln().toInt()) {
                    1 -> {
                        newAverageLoopQuestion = false
                        repeatProgram = true
                    }
                    2 -> {
                        newAverageLoopQuestion = false
                        repeatProgram = false
                    }
                    else -> {
                        PrintMessages().showMessageNotValidTryAgain()
                    }
                }

            } catch (e: NumberFormatException) {
                PrintMessages().showMessageInCaseInvalidCharacterIsInserted()
            }
        }
    }
}

class Calculations() {
    fun calculateAverage() {
        average = grades.average()
        stringAverage = "%.2f".format(average)
    }

    fun checkResult() {
        result =
            if (average >= 7) PrintMessages().showMessageStudentHasSucceeded()
            else PrintMessages().showMessageStudentHasFailed()
    }
}