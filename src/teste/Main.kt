package teste

fun main() {

    val ageLucas = 17

    val valor = isMajorPerson(ageLucas)
        .isTrue {
            println("Idade da pessoa e maior")
        }.isFalse {
            println("Idade da pessoa e menor")
        }
    println(valor)
}

private fun isMajorPerson(age: Int): Boolean {
    return age >= 18
}