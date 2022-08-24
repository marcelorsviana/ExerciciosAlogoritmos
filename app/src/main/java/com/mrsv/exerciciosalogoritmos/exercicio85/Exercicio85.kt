package com.mrsv.exerciciosalogoritmos.exercicio85

/**
 * 85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
 * guarde esses dados em três vetores. No final, mostre uma listagem contendo
 * apenas os dados das funcionárias mulheres que ganham mais de R$5 mil
 */

fun main(){

    val nome = mutableListOf<String>()
    val sexo = mutableListOf<Int>()
    val salario = mutableListOf<Double>()
    val listaMulheresSelecionadas = mutableListOf<String>()

    for (i in 1..5){
        println("Informe o nome do(a) funcionário:")
        nome.add(readln())
        println("Informe o sexo do(a) funcionário(a). Pressione 1 para feminino e 2 para masculino:")
        sexo.add(readLine()?.toInt()!!)
        println("Informe o salário do(a) funcionário(a).")
        salario.add(readLine()?.toDouble()!!)
    }

    for (i in 0..4){
        if (sexo[i] == 1) {
            if (salario[i] > 5000) {
                listaMulheresSelecionadas.add(nome[i])
            }
        }
    }

    println("As funcionárias que possuem salário maior que R$5.000 são: ${listaMulheresSelecionadas}.")
}