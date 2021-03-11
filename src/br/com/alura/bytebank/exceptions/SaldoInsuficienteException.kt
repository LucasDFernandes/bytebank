package br.com.alura.bytebank.exceptions

class SaldoInsuficienteException(
    mensagem: String = "O Saldo é Insuficiente"
) : Exception(mensagem)