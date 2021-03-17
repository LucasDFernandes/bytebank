package br.com.alura.collections.avancado

fun testaAdicaoRemocaoMap() {
    val pedidos = mutableMapOf(
        1 to 50.0,
        2 to 40.0,
        5 to 8.0
    )

    //val pedido = pedidos.getValue(4)
    pedidos.getOrElse(0, {
        println("Nao tem Value")
    })

    val orDefault = pedidos.getOrDefault(0, -1.0)
    println(orDefault)

    val pedidosFiltrados = pedidos.filter { (_, valor) -> valor > 25.0 }
    println(pedidosFiltrados)

    println(pedidos + Pair(7, 90.0))

    println(pedidos - 1)

    pedidos.putAll(setOf(10 to 100.0, 15 to 200.0))
    println(pedidos)

    pedidos += listOf(20 to 300.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)
}

fun testaMap() {
    val pedidos = mutableMapOf(Pair(1, 20.0), 3 to 25.0)
    println(pedidos)

    val primeiroPedido = pedidos[1]
    primeiroPedido?.let {
        println("valor do pedido = $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidos[4] = 50.0
    pedidos.put(5, 75.0)

    println(pedidos)
    pedidos[4] = 105.0
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
}