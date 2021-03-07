package br.com.alura.bytebank

import br.com.alura.bytebank.model.*

fun main() {

    val cliente = Cliente(
        nome = "Cliente",
        cpf = "222.222.222-55",
        senha = 155
    )

    val gerente = Gerente(
        nome = "Lucas",
        senha = 777,
        cpf = "111.111.111-55",
        salario = 5000.0
    )

    //testaContasDiferentes()
    //testaComportamentosFuncionarios()
    //testaComportamentosConta()
}

private fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Lucas",
        numero = 777
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Luna",
        numero = 555
    )

    contaCorrente.deposita(100.00)
    contaPoupanca.deposita(100.00)

    println("Saldo ${contaCorrente.javaClass.simpleName}: ${contaCorrente.saldo}")
    println("Saldo ${contaPoupanca.javaClass.simpleName}: ${contaPoupanca.saldo}")

    contaCorrente.saca(50.0)
    contaPoupanca.saca(50.0)

    println("Saldo ${contaCorrente.javaClass.simpleName}: ${contaCorrente.saldo}")
    println("Saldo ${contaPoupanca.javaClass.simpleName}: ${contaPoupanca.saldo}")
}

private fun testaComportamentosFuncionarios() {
    val funcionarioLucas = Analista(
        nome = "Lucas",
        cpf = "99999999999",
        salario = 1000.0
    )

    println("Nome e ${funcionarioLucas.nome}")
    println("CPF e ${funcionarioLucas.cpf}")
    println("Salario e ${funcionarioLucas.salario}")
    println("Bonificacao e ${funcionarioLucas.getBonificacao()}")

    val gerente = Gerente(
        nome = "Gerente",
        cpf = "222.222.222-00",
        salario = 5000.0,
        senha = 123456
    )

    val diretor = Diretor(
        nome = "Gerente",
        cpf = "222.222.222-00",
        salario = 5000.0,
        senha = 123456,
        plr = 50000.00
    )

    println("PLR: ${diretor.plr}")

    val analista = Analista(
        nome = "analista",
        cpf = "222.222.222-00",
        salario = 5000.0,
    )


    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(funcionarioLucas)
    calculadoraBonificacao.registra(gerente)
    calculadoraBonificacao.registra(diretor)
    calculadoraBonificacao.registra(analista)

    println("Total de bonificacao: ${calculadoraBonificacao.total}")
}

private fun testaComportamentosConta() {
    val contaLucas = ContaCorrente(titular = "Lucas Fernandes", numero = 1)
    val contaBianca = ContaPoupanca(titular = "Bianca Santana", numero = 2)

    contaLucas.deposita(valor = 50.0)
    contaBianca.deposita(valor = 100.0)

    contaBianca.transfere(contaDestino = contaLucas, valor = 10.0)
    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)

    contaLucas.deposita(valor = 500.0)
    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)
}
