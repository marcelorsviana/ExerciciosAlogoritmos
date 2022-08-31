package com.mrsv.exerciciosalogoritmos.exercise68

/**
 * 82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
 * um vetor. No final, mostre:
 * a) Qual é a média da turma
 * b) Quantos alunos estão acima da média da turma
 * c) Qual foi a maior nota digitada
 * d) Em que posições a maior nota aparece *
 */

fun main() {

    var sexo: Int
    var peso: Double
    val pesoFeminino = mutableListOf<Double>()
    val pesoMasculino = mutableListOf<Double>()
    var quantidadeHomensMaior100Quilos = 0



    for (i in 1..8) {
        println("Qual é o sexo da pessoa de número $i? Digite 1 para feminino e 2 para masculino.")

        sexo = readLine()?.toInt()!!
        when (sexo) {
            1 -> {
                println("Qual é o peso?")
                peso = readLine()?.toDouble()!!
                pesoFeminino.add(peso)
                //println(pesoFeminino)
                peso = 0.0
            }
            2 -> {
                println("Qual é o peso?")
                peso = readLine()?.toDouble()!!
                pesoMasculino.add(peso)
                //println(pesoMasculino)
                if (peso > 100) quantidadeHomensMaior100Quilos++
                peso = 0.0
            }
        }
    }

    println("Foram cadastradas ${pesoFeminino.size} mulheres.")

    if (quantidadeHomensMaior100Quilos == 0) {
        println("Não há homens que pesam mais que 100 quilos no grupo informado.")
    } else {
        println("Existem $quantidadeHomensMaior100Quilos homens que pesam mais que 100 quilos.")
    }

    println("A média de peso no grupo das mulheres é de ${pesoFeminino.average()} quilos.")

    println("O maior peso no grupo dos homens é de ${pesoMasculino.max()} quilos.")
}