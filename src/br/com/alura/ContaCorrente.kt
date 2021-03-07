package br.com.alura

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {

    override fun saca(valor: Double): Double? {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
            return valor
        }
        return null
    }
}