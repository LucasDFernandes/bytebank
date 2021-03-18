package br.com.alura.bytebank.model

class SistemaInterno {

    fun login(usuario: Autenticado, senha: Int, autenticado: () -> Unit = {}, naoAutenticado: () -> Unit = {}) {
        if (usuario.autenticar(senha)) {
            println("Logado")
            autenticado()
        } else {
            println("Não autorizado")
            naoAutenticado()
        }
    }

}