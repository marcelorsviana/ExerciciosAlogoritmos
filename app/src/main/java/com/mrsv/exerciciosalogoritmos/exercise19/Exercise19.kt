package com.mrsv.exerciciosalogoritmos.exercise19

/**
 *  19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
 *  média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
 *  não um bom aproveitamento (se ficou acima da média 7.0)
 */

// e se forem n notas?

fun main() {

    val nota1: Double
    val nota2: Double
    val media: Double

    println("Informe a primeira nota:")

    nota1 = readLine()?.toDouble() ?: 0.0
    nota2 = readLine()?.toDouble() ?: 0.0

    media = (nota1 + nota2) / 2

    if (media >= 7.0){
        println("A média é de $media -> APROVADO(A)")
    } else {
        println("A média é de $media -> REPROVADO(A)")
    }


}