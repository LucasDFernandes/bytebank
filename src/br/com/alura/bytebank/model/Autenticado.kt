package br.com.alura.bytebank.model

interface Autenticado {

    val senha: Int

    fun autenticar(senha: Int) : Boolean = this.senha == senha
}