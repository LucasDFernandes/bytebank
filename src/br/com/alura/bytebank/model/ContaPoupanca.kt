package br.com.alura.bytebank.model

class ContaPoupanca(
    titular: Cliente,
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