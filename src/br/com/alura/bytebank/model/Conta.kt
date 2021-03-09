package br.com.alura.bytebank.model

abstract class Conta(
    val titular: Cliente,
    val numero: Int,
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double): Double?

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.deposita(valor)
            return true
        }

        return false
    }

}
