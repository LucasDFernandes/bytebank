package br.com.alura

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double): Double? {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return valor
        }
        return null
    }
}