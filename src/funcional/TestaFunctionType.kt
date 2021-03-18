package funcional

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(30, 40))


    val calculaBonificacaoAnonma: (salario: Double) -> Double = fun(salario): Double {
        if (salario >= 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonma(2000.0))
    println(calculaBonificacaoAnonma(300.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(10, 10))

    val calculaBonifacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario >= 1000.0) {
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonifacao(1000.0))
    println(calculaBonifacao(900.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse = Soma()
    println(minhaFuncaoClasse(20, 50))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::soma
    println(minhaFuncao(5, 10))
}

private fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}