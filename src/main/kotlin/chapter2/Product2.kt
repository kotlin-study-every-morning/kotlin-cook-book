package chapter2

data class Product2(
    val name: String,
    val price: Double = 0.0,
    val desc: String? = null
) {
    constructor(name: String, price: Double) : this(name, price, null)

    constructor(name: String) : this(name, 0.0, null)
}
