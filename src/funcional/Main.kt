package funcional

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaPoupanca
import br.com.alura.bytebank.model.Endereco

fun main() {
    testaRun()
}

fun testaRun() {
    val taxaAnual = 0.5
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Lucas", cpf = "111.111.111-11", senha = 123456), 1000)

    contaPoupanca
        .run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let(::println)

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println(rendimentoAnual)
}

fun testaWith() {
    with(Endereco()) {
        lougradouro = "rua Dias da Cruz"
        numero = 933
        bairro = "Meier"
        cidade = "Rio de Janeiro"
        estado = "RJ"
        cep = "20720-011"
        complemento = "apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}
