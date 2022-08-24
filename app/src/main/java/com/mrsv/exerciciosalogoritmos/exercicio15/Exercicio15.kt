package com.mrsv.exerciciosalogoritmos.exercicio15

/**
 *  15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
 *  salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
 *  por hora trabalhada.
 */

fun main(){

    val diasTrabalhados: Int
    val salario: Double
    val umDiaTrabalhado = 8 * 25

    println("Quantos dias o funcionário trabalhou neste mês?")
    diasTrabalhados = readLine()?.toInt() ?: 0

    salario = diasTrabalhados * umDiaTrabalhado.toDouble()

    println("O salário do funcionário é de R$${salario}")


}