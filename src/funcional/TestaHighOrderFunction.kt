package funcional

import br.com.alura.bytebank.model.Autenticado
import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.model.SistemaInterno
import java.util.Objects.nonNull

fun main() {
    testaHighOrderFunction()
}

fun testaHighOrderFunction() {
    Endereco(lougradouro = "Rua Dias da Cruz", numero = 933)
        .let { endereco ->
            "${endereco.lougradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter {
        nonNull(it.complemento)
    }.let(::println)

    soma(1, 5) {
        println(it)
    }

    val autenticavel = object : Autenticado {
        override val senha: Int = 1234
    }

    SistemaInterno().login(
        autenticavel,
        1234,
        autenticado = {
            println("Pode Realizar Pagamentos")
        },
        naoAutenticado = {
            println("Nao pode realizar pagamentos")
        }
    )
}


private fun soma(a: Int, b: Int, resultado: (Int) -> Unit = {}) {
    resultado(a + b)
}