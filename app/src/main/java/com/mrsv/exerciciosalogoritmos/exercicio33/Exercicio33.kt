package com.mrsv.exerciciosalogoritmos.exercicio33

/**
 *  33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
 *  de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
 *  em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
 *  ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */


fun main() {

    val valorImovel: Double
    val salarioDoComprador: Double
    val quantidadeAnosQuitacao: Int
    val prestacaoMensal: Double

    println("Informe o valor do imóvel:")
    valorImovel = readLine()?.toDouble()!!

    println("Informe o salário do comprador:")
    salarioDoComprador = readLine()?.toDouble()!!

    println("Informe a quantidade de anos para a quitação do imóvel:")
    quantidadeAnosQuitacao = readLine()?.toInt()!!

    prestacaoMensal = valorImovel / quantidadeAnosQuitacao

    if (prestacaoMensal > salarioDoComprador - (salarioDoComprador * 0.7)) {
        println("Empréstimo negado!")
    } else {
        println("Empréstimo concedido!")
    }

}