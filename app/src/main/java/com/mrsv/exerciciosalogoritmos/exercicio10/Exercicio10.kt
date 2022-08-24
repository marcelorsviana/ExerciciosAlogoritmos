package com.mrsv.exerciciosalogoritmos.exercicio10

/**
 * 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */

fun main(){
    val altura: Double
    val largura: Double
    val area: Double
    val quantidadeTinta: Double

    println("Informe a altura da parede:")
    altura = readLine()?.toDouble () ?: 0.0
    println("Informe a largura da parede:")
    largura = readLine()?.toDouble () ?: 0.0

    area = altura * largura
    quantidadeTinta = area / 2

    println("altura: $altura")
    println("largura: $largura")
    println("area: $area")
    println("A quantidade de tinta necessária para se pintar $area m² é de ${quantidadeTinta} litros.")

}