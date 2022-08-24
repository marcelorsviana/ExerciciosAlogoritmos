package com.mrsv.exerciciosalogoritmos.exercicio29

/**
 * 29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
 * quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
 * acordo com a tabela a seguir:
 * - Até 3 anos de empresa: aumento de 3%
 * - entre 3 e 10 anos: aumento de 12.5%
 * - 10 anos ou mais: aumento de 20%
 */

fun main() {
    val nome: String
    val salario: Double
    val anosDeTrabalho: Int
    val salarioNovo: Double

    println("Informe o nome do(a) funcionário(a):")
    nome = readLine().toString()

    println("Informe o salário do(a) funcionário(a):")
    salario = readLine()?.toDouble()!!

    println("Informe a quantidade de anos trabalhados do(a) funcionário(a):")
    anosDeTrabalho = readLine()?.toInt()!!

    if (anosDeTrabalho <= 3) salarioNovo = salario + (salario * 0.03)
    else if (anosDeTrabalho in 4..9) salarioNovo = salario + (salario * 0.125)
    else salarioNovo = salario + (salario * 0.2)

    println("O novo salário do(a) funcionário(a) $nome é de R$${salarioNovo}")
}