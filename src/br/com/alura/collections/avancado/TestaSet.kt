package br.com.alura.collections.avancado

fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Lucas", "Luna", "Bianca")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Luiz", "Andrea", "Andressa", "Lucas")
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid intersect  assistiramCursoKotlin)
    println(assistiramAmbos)
}