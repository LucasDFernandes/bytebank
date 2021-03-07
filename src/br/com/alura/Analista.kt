package br.com.alura

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {

    override fun getBonificacao(): Double = salario * 0.1
}