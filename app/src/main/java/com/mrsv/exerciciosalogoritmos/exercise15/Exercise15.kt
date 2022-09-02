package com.mrsv.exerciciosalogoritmos.exercise15

/**
 *  15) Create a program that reads the number os worked days in a months and that shows the
 *  employee's salary. It is known that the employee works 8 hours a day and earns US$ 25
 *  per worked hour.
 */

fun main() {
    val diasTrabalhados: Int
    val salario: Double
    val umDiaTrabalhado = 8 * 25

    println("Quantos dias o funcionário trabalhou neste mês?")
    diasTrabalhados = readLine()?.toInt() ?: 0

    salario = diasTrabalhados * umDiaTrabalhado.toDouble()

    println("O salário do funcionário é de R$$salario")
}
