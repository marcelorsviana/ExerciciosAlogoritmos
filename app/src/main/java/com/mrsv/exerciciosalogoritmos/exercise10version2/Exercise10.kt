package com.mrsv.exerciciosalogoritmos.exercise10version2

/**
 * 10) Make an algorithm that reads the width and height of a wall, calculate and
 * show the area to be painted and the quantity of paint necessary for the service.
 * It is known that each liter of paint corresponds to 2 m².
 */

fun main() {
    var wallHeight: Double
    var wallWidth: Double
    var key = 1

    while (key == 1) {
        println("What is the height of the wall?")
        wallHeight = readln().toDouble()
        if (wallHeight > 0) {
            println("What is the width of the wall?")
            wallWidth = readln().toDouble()
            if (wallWidth > 0) {
                val area = CalculatesWallArea()
                val areaOfTheWall = area.calculatesWallArea(wallWidth, wallHeight)
                val quantityOfPaint = CalculateQuantityOfPaint()
                val necessaryQuantityOfPaint = quantityOfPaint.calculateQuantityOfPaint(areaOfTheWall)
                val areaMessage = ShowAreaMessage()
                areaMessage.showAreaMessage(areaOfTheWall)
                val quantityOfPaintMessage = ShowQuantityOfPaintMessage()
                quantityOfPaintMessage.showQuantityOfPaintMessage(necessaryQuantityOfPaint)
            } else {
                println("You've inserted an invalid width!")
            }
        } else {
            println("You've inserted an invalid height!")
        }
        println("Would you like to try it again? \nPress 1 to continue.")
        key = readln().toInt()
    }
}

class CalculatesWallArea {
    fun calculatesWallArea(width: Double, height: Double): Double{
        val area = width * height
        return area
    }
}

class CalculateQuantityOfPaint {
    fun calculateQuantityOfPaint(area: Double): Double{
        val quantityOfPaint = area / 2
        return quantityOfPaint
    }

}

class ShowAreaMessage {
    fun showAreaMessage(area: Double) {
        println("The wall area is ${area} square meters.")
    }
}

class ShowQuantityOfPaintMessage {
    fun showQuantityOfPaintMessage(quantityOfPaint: Double) {
        println("The amount of paint necessary to paint is ${quantityOfPaint} liters.")
    }
}