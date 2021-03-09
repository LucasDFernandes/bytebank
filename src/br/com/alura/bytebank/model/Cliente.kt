package br.com.alura.bytebank.model

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    override val senha: Int,
) : Autenticado