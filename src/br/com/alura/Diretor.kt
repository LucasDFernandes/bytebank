package br.com.alura

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {
    override fun getBonificacao(): Double = salario + plr
}