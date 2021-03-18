package teste

fun Boolean.isTrue(block: (Boolean) -> Unit) : Boolean {
    if (this)
        block(this)
    return this
}

fun Boolean.isFalse(block: (Boolean) -> Unit) : Boolean {
    if (!this)
        block(this)
    return this
}