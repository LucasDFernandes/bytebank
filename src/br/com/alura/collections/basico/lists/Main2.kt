package br.com.alura.collections.basico.lists

fun main() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = mutableListOf(
            Livro(
                titulo = "Grande Sertão: Veredas",
                autor = "João Guimarães",
                anoPublicacao = 1956
            ),
            Livro(
                titulo = "Minha vida de menina",
                autor = "Helena Morley",
                anoPublicacao = 1942,
                editora = "Editora A"
            ),

            Livro(
                titulo = "Memórias Póstumas de Brás Cubas",
                autor = "Machado de Assis",
                anoPublicacao = 1881
            )
        )
    )

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
}