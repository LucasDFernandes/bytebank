package br.com.alura.bytebank.model

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun getBonificacao(): Double = salario * 0.1
}