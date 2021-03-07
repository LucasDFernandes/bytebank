package br.com.alura

interface Autenticado {

    val senha: Int

    fun autenticar(senha: Int) : Boolean = this.senha == senha
}