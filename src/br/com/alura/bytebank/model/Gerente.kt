package br.com.alura.bytebank.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
), Autenticado {

    override fun getBonificacao(): Double = salario

}