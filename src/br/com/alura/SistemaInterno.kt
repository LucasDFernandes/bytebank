package br.com.alura

class SistemaInterno {

    fun login(usuario: Autenticado, senha: Int) {
        if (usuario.autenticar(senha)) {
            println("Logado")
        } else {
            println("Não autorizado")
        }
    }

}