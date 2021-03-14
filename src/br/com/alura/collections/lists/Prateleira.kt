package br.com.alura.collections.lists

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor() : List<Livro> = livros.sortedBy { it.autor }

    fun organizarPorAnoPublicacao() : List<Livro> = livros.sortedBy { it.anoPublicacao }
}