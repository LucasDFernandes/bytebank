package br.com.alura.collections

fun main() {


//    atualizaElementosArray()
//    printMaiorEMenorIdade()
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