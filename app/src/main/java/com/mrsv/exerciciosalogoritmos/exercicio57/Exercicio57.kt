package com.mrsv.exerciciosalogoritmos.exercicio57

import android.os.Build.VERSION_CODES.S

/**
 * 57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
 * No final, mostre o total de salários pagos aos homens e o total pago às
 * mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
 * sempre que ler os dados de um funcionário
 */

fun main() {

    var sexo: Int
    var salarioFeminino: Double
    var salarioMasculino: Double
    var salarioFemininoTotal = 0.0
    var salarioMasculinoTotal = 0.0
    var chave = true

    while(chave){
        println("Qual é o sexo do(a) funcionário(a)? Digite 1 para feminino e 2 para masculino.")

        sexo = readLine()?.toInt()!!

        when (sexo) {
            1 -> {
                println("Qual é o salário?")
                salarioFeminino = readLine()?.toDouble()!!
                salarioFemininoTotal += salarioFeminino
            }

            2 -> {
                println("Qual é o salário?")
                salarioMasculino = readLine()?.toDouble()!!
                salarioMasculinoTotal += salarioMasculino
            }
        }
        println("Deseja informar mais salários? \n S ou N")

        val resposta = readLine()

        if (resposta == "N" || resposta == "n") break
    }

    println("O total de salário pago às mulheres é de R$${salarioFemininoTotal}.")
    println("O total de salário pago aos homens é de R$${salarioMasculinoTotal}.")
}


