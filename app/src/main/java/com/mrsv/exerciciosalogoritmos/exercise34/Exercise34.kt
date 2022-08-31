package com.mrsv.exerciciosalogoritmos.exercise34

/**
 *  34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
 *  peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
 *  indivíduo dentro de certas faixas.
 *  - abaixo de 18.5: Abaixo do peso
 *  - entre 18.5 e 25: Peso ideal
 *  - entre 25 e 30: Sobrepeso
 *  - entre 30 e 40: Obesidade
 *  - acima de 40: Obseidade mórbida
 */


fun main() {

    val altura: Double
    val peso: Double
    val imc: Double

    println("Informe sua altura:")
    altura = readLine()?.toDouble()!!
    println("Informe seu peso:")
    peso = readLine()?.toDouble()!!

    imc = peso / (altura * altura)

    if(imc < 18.5) println("Abaixo do peso")
    else if (imc in 18.5..25.0) println("Peso ideal")
    else if (imc in 25.0..30.0) println("Sobrepeso")
    else if (imc in 30.0..40.0) println("Obesidade")
    else println("Obesidade mórbida")
}