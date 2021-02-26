package br.com.alura

fun main() {
    val contaLucas = Conta(titular = "Lucas Fernandes", numero = 1)
    val contaBianca = Conta(titular = "Bianca Santana", numero = 2)

    contaLucas.deposita(valor = 50.0)
    contaBianca.deposita(valor = 100.0)

    contaBianca.transfere(contaDestino = contaLucas, valor = 10.0)
    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)

    contaLucas.deposita(valor = 500.0)
    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)

}
