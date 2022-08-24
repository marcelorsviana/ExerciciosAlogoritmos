package com.mrsv.exerciciosalogoritmos

/**
 * 8) Desenvolva um programa que leia uma distância em metros e mostre os valores
 * relativos em outras medidas. Ex:
 *  Digite uma distância em metros: 185.72
 *  A distância de 85.7m corresponde a:
 *  0.18572Km
 *  1.8572Hm
 *  18.572Dam
 *  1857.2dm
 *  18572.0cm
 *  185720.0m
 */

fun main() {
    var distanciaMetros = -1.0

    while (distanciaMetros < 0.0) {
        println("Digite uma distância em metros: ")
        distanciaMetros = readLine()?.toDouble() ?: 0.0

        if (distanciaMetros > 0) {
            val converters = arrayOf(MetrosParaQuilometros())
            converters.forEach { println(it.convert(distanciaMetros)) }
        } else if (distanciaMetros < 0) {
            println("Informe uma distância maior que zero.")
        }
    }
}

interface Converter {
    fun convert(distanciaEmMetros: Double): String
}

class MetrosParaQuilometros() : Converter {
    override fun convert(distanciaEmMetros: Double): String {
        return "${distanciaEmMetros / 1000}km"
    }
}