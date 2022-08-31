package com.mrsv.exerciciosalogoritmos.exercise10

import com.mrsv.exerciciosalogoritmos.exercise10.PrintMessages.Companion.area
import com.mrsv.exerciciosalogoritmos.exercise10.PrintMessages.Companion.quantityOfPaint
import com.mrsv.exerciciosalogoritmos.exercise10.Program.Companion.key

/**
 * 10) Make an algorithm that reads the width and height of a wall, calculate and
 * show the area to be painted and the quantity of paint necessary for the service.
 * It is known that each liter of paint corresponds to 2 m².
 */


fun main() {

    var wallWidth: Double
    var wallHeight: Double
    val showMessages = PrintMessages()
    val program = Program()

    while (key) {
        println("What is the width of the wall:")
        wallWidth = readln().toDouble()

        if (wallWidth > 0) {
            println("What is the height of the wall?")
            wallHeight = readln().toDouble()
            if (wallHeight > 0) {
                val calculate = MakeCalculations(wallWidth, wallHeight)
                calculate.calculateQuantityOfPaint()

                showMessages.showAreaMessage()
                showMessages.showQuantityOfPaintMessage()
            } else {
                showMessages.showNotValidWidthMessage()
            }
        } else {
            showMessages.showNotValidHeightMessage()
        }
        showMessages.showSwitchOffMessage()
        program.switchOffProgram()
    }
}


class MakeCalculations(val width: Double, val height: Double) {

    fun calculatesWallArea(width: Double, height: Double): Double {
        area = width * height
        return area
    }

    fun calculateQuantityOfPaint(): Double {
        quantityOfPaint = calculatesWallArea(width, height) / 2
        return quantityOfPaint
    }
}


class PrintMessages {

    companion object {
        var area = 0.0
        var quantityOfPaint = 0.0
    }

    fun showAreaMessage() {
        println("The wall area is ${area} square meters.")
    }

    fun showQuantityOfPaintMessage() {
        println("The amount of paint necessary to paint the wall is ${quantityOfPaint} liters.")
    }

    fun showNotValidWidthMessage() {
        println("You've inserted an invalid width!")
    }

    fun showNotValidHeightMessage() {
        println("You've inserted an invalid height!")
    }

    fun showSwitchOffMessage() {
        println("\nPress 1 to calculate again. Press any other key to exit the program.")
    }
}

class Program {
    companion object {
        var key = true
    }

    fun switchOffProgram() {
        val key2 = readln().toInt()
        if (key2 != 1) key = false
    }
}
