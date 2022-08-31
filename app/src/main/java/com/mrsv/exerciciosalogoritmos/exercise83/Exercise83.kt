package com.mrsv.exerciciosalogoritmos.exercise83

import kotlin.random.Random

/**
 * 83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
 * aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
 * números gerados e depois coloque o vetor em ordem crescente, mostrando no final
 * os valores ordenados.
 */

fun main() {

    val listaDeNumeros = mutableListOf<Int>()

    for (i in 0..19) {
        listaDeNumeros.add(Random.nextInt(99))
    }

    println("Lista com números gerados aleatoriamente:\n $listaDeNumeros")
    println("Mesma lista, porém em ordem crescente:\n ${listaDeNumeros.sorted()}")
}
