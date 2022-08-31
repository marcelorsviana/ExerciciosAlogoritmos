package com.mrsv.exerciciosalogoritmos.exercise10

/**
 * 10) Make an algorithm that reads the width and height of a wall, calculate and
 * show the area to be painted and the quantity of paint necessary for the service.
 * It is known that each liter of paint corresponds to 2 m².
 */

var key = true

fun main() {
    var wallHeight: Double
    var wallWidth: Double

    while (key) {
        println("What is the height of the wall:")
        wallHeight = readln().toDouble()

//        if (wallHeight <= 0) {
//            println("Please input a value greater than zero!")
//        } else {
//            println("What is the width of the wall?")
//            wallWidth = readln().toDouble()
//            if (wallWidth <= 0) {
//                println("Please input a value greater than zero!")
//            } else {
//                val makeCalculations = MakeCalculations()
//                makeCalculations.calculatesWallArea(wallWidth, wallHeight)
//                makeCalculations.calculateQuantityOfPaint()
//                makeCalculations.showAreaMessage()
//                makeCalculations.showQuantityOfPaintMessage()
//            }
//        }

        if (wallHeight > 0) {
            println("What is the width of the wall?")
            wallWidth = readln().toDouble()
            if (wallWidth > 0) {
                val makeCalculations = MakeCalculations()
                // TODO: transformar em método privado 
                makeCalculations.calculatesWallArea(wallWidth, wallHeight)
                // TODO: reutilizar o método calculatesWallArea()
                makeCalculations.calculateQuantityOfPaint()
                // TODO: transportar métodos print para outra classe 
                makeCalculations.showAreaMessage()
                makeCalculations.showQuantityOfPaintMessage()
            } else {
                endMessage()
            }
        } else {
            endMessage()
        }
    }
}

// TODO: colocar key dentro da class Program (A ser criada)
// TODO: Transformar em classe PrintMessage. 
fun endMessage() {
    println("You've inserted an invalid value!")
    key = false
}

interface CalculateWallArea {
    fun calculatesWallArea(width: Double, height: Double): Double
}

interface QuantityOfPaint : CalculateWallArea {
    fun calculateQuantityOfPaint(): Double
}

interface AreaMessage {
    fun showAreaMessage()
}

interface QuantityOfPaintMessage {
    fun showQuantityOfPaintMessage()
}


class MakeCalculations() : QuantityOfPaint, AreaMessage, QuantityOfPaintMessage {
    var area = 0.0
    var quantityOfPaint = 0.0

    override fun calculatesWallArea(width: Double, height: Double): Double {
        area = width * height
        return area
    }

    override fun calculateQuantityOfPaint(): Double {
        quantityOfPaint = area / 2
        return quantityOfPaint
    }

    override fun showAreaMessage() {
        println("The wall area is ${area} square meters.")
    }

    override fun showQuantityOfPaintMessage() {
        println("The amount of paint necessary to paint is ${quantityOfPaint} liters.")
    }
}