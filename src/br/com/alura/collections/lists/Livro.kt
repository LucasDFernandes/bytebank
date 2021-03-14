package br.com.alura.collections.lists

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
)