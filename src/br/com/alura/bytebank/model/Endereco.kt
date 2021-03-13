package br.com.alura.bytebank.model

class Endereco(
    var lougradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String? = null,
) {

    override fun toString(): String {
        return """
                Endereco(
                    lougradouro='$lougradouro', 
                    numero=$numero, 
                    bairro='$bairro', 
                    cidade='$cidade', 
                    estado='$estado', 
                    cep='$cep', 
                    complemento='$complemento')
               """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (other != null && other is Endereco)
            return this.cep == other.cep
        return false
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }


}