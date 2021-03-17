package br.com.alura.collections.avancado

fun main() {

    val pedidos = listOf(
        Pedido(1, 10.0),
        Pedido(2, 20.0),
        Pedido(3, 30.0),
        Pedido(4, 40.0),
        Pedido(5, 50.0),
    )

    val pedidosMap = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMap)

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50 }
    println(pedidosFreteGratis)

    val pedidosAgrupados = pedidos.groupBy { pedido -> pedido.valor > 25.0 }
    println(pedidosAgrupados)
    val listaPedidosFreteGratis = pedidosAgrupados[true]
    println(listaPedidosFreteGratis)

}

data class Pedido(val numero: Int, val valor: Double)
