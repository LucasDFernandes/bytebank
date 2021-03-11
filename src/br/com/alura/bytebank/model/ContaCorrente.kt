package br.com.alura.bytebank.model

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {

    @Throws(SaldoInsuficienteException::class)
    override fun saca(valor: Double): Double {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
            return valor
        }
        throw SaldoInsuficienteException()
    }
}