package com.mrsv.exerciciosalogoritmos.exercise19

/**
 *  19) Create an algorithm that reads the name and two grades of a student, calculates his/her
 *  average and shows it on the screen. In the end, analise the average and say if the student
 *  succeeded or not. (The student will succeed if his/her average is at least 7.0)
 */

// TODO:   e se forem n notas?

fun main() {
    val nota1: Double
    val nota2: Double
    val media: Double

    println("Informe a primeira nota:")

    nota1 = readLine()?.toDouble() ?: 0.0
    nota2 = readLine()?.toDouble() ?: 0.0

    media = (nota1 + nota2) / 2

    if (media >= 7.0) {
        println("A média é de $media -> APROVADO(A)")
    } else {
        println("A média é de $media -> REPROVADO(A)")
    }
}
