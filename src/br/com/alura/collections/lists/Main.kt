package br.com.alura.collections.lists

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val listaLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3)
    listaLivros.imprimeComMarcadores()

    listaLivros
        .sortedBy { it.autor }
        .imprimeComMarcadores()

    listaLivros
        .filter { it.autor.startsWith("João") }
        .imprimeComMarcadores()

    listaLivros
        .groupBy { it.editora ?: "Editora Desconhecida"}
        .forEach { (editora, livros) ->
            println("${editora}: ${livros.joinToString { it.titulo }}")
        }
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") { livro ->
        " - ${livro.titulo} de ${livro.autor}"
    }
    println("### Lista de Livros ### \n$textoFormatado")
}