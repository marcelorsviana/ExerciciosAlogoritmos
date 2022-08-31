package com.mrsv.exerciciosalogoritmos.exercise82

/**
 * 82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
 * um vetor. No final, mostre:
 * a) Qual é a média da turma
 * b) Quantos alunos estão acima da média da turma
 * c) Qual foi a maior nota digitada
 * d) Em que posições a maior nota aparece. *
 */

fun main(){

    val notas = mutableListOf<Double>()
    var notaInformada: Double
    var alunoAcimaMedia = 0
    var maiorNotaInformada = 0.0
    var quantidadeAlunosNotaSuperiorAMedia = 0
    var contador = 1
    val posicaoDaMaiorNotaNaLista: Int

    while(contador <= 10) {
        println("Informe a nota de número $contador:")
        notaInformada = readLine()?.toDouble()!!
        notas.add(notaInformada)
        if (notaInformada >= 7.0) alunoAcimaMedia++
        if (notaInformada > maiorNotaInformada) maiorNotaInformada = notaInformada
        contador++
    }

    println("SIZE: notas ${notas.average()}")
    println()
    println("NOTAS: ${notas}")

    for (i in 0..9){
        if(notas[i] > notas.average()) quantidadeAlunosNotaSuperiorAMedia++
    }

    posicaoDaMaiorNotaNaLista = notas.indexOf(notas.max()) + 1

    println("A média da turma é de ${notas.average()}.")
    println("Existem ${quantidadeAlunosNotaSuperiorAMedia} alunos com nota acima da média da turma.")
    println("A maior nota informada foi ${notas.max()}.")
    println("A maior nota informada foi a ${posicaoDaMaiorNotaNaLista} posição")
}