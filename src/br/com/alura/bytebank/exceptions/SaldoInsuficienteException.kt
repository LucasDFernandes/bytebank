package br.com.alura.bytebank.exceptions

class SaldoInsuficienteException(
    mensagem: String = "O Saldo � Insuficiente"
) : Exception(mensagem)