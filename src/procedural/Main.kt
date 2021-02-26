package procedural

fun main() {
    println("Hello World")

    for (i in 1..5) {
        val titular = "Lucas Fernandes $i"
        val numeroConta = 755 + i
        var saldo = 0.0
        saldo = 100.0

        println("Titular é $titular")
        println("Numero da Conta é $numeroConta")
        println("Saldo é $saldo")
        println("")

        testaCondicoes(saldo)
    }



}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta esta vazia")
        else -> println("conta esta negativa")
    }
}