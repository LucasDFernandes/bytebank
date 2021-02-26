package br.com.alura

class Conta(val titular: String, val numero: Int) {

    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double): Double? {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return valor
        }
        return null
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.deposita(valor)
            return true
        }

        return false
    }

}
