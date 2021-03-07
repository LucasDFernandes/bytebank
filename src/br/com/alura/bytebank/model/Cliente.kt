package br.com.alura.bytebank.model

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int,
) : Autenticado