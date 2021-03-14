package br.com.alura.collections.basico.lists

fun main() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = mutableListOf(
            Livro(
                titulo = "Grande Sert�o: Veredas",
                autor = "Jo�o Guimar�es",
                anoPublicacao = 1956
            ),
            Livro(
                titulo = "Minha vida de menina",
                autor = "Helena Morley",
                anoPublicacao = 1942,
                editora = "Editora A"
            ),

            Livro(
                titulo = "Mem�rias P�stumas de Br�s Cubas",
                autor = "Machado de Assis",
                anoPublicacao = 1881
            )
        )
    )

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
}