package br.com.alura.collections

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

}

private fun testaArrayBigDecimalEMap() {
    val arrayOfBigDecimals = bigDecimalArrayOf("1500.55", "2000.50", "5000.0", "150000.0")
    println(arrayOfBigDecimals.contentToString())

    val salariosComAumento = arrayOfBigDecimals
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * 1.1.toBigDecimal()).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())
}

private fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

private fun testaOperacoesAgregadoras() {
    val idades = intArrayOf(10, 12, 15, 19, 65, 42, 35)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("media idade: $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos Maiores ?  $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Existe maior ?  $existeMaior")

    val filter = idades.filter { it >= 18 }
    println("Maiores:  $filter")

    val busca = idades.find { it == 42 }
    println("Achou o valor:  $busca")
}

private fun testaRanges() {
    val serie = 1.rangeTo(10)
    for (s in serie) {
        println(s)
    }

    println("")

    val intRange = 0..100 step 2
    intRange.forEach { numero ->
        println(numero)
    }

    val intervalo = 1500.0..5000.0
    val salario = 3000.0

    if (salario in intervalo) {
        println("Esta dentro do intervalo")
    } else {
        println("Não esta dentro do intervalo")
    }
}

private fun atualizaElementosArray() {
    val arraySalarios = doubleArrayOf(1500.50, 2300.0, 10000.00)
    val aumento = 1.1

    for ((index, salario) in arraySalarios.withIndex()) {
        arraySalarios[index] = salario * aumento
    }
    println(arraySalarios.contentToString())

    arraySalarios.forEachIndexed { index, salario ->
        arraySalarios[index] = salario * aumento
    }

    println(arraySalarios.contentToString())
}

private fun printMaiorEMenorIdade() {
    val idades: IntArray = intArrayOf(25, 33, 15, 40, 60)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}