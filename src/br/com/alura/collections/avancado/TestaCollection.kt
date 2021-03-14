package br.com.alura.collections.avancado

fun main() {
    testaCopia()
}

fun testaCopia() {
    val bancoDeNomes = BancoDeNomes()

    bancoDeNomes.salva("Lucas")
    bancoDeNomes.salva("Luna")
    bancoDeNomes.salva("Bianca")

    val nomes = bancoDeNomes.nomes
    println(nomes)
}

class BancoDeNomes {
    companion object {
        private val dados = mutableListOf<String>()
    }

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) = dados.add(nome)
}