package br.com.alura

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: Int,
    val plr: Double
) : Funcionario(
    nome,
    cpf,
    salario
), Autenticado {
    override fun getBonificacao(): Double = salario + plr
}