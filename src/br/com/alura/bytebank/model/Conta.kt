package br.com.alura.bytebank.model

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

abstract class Conta(
    val titular: Cliente,
    val numero: Int,
) {
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double): Double

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        throw SaldoInsuficienteException()
    }

}
