package chapter2

import java.awt.Color
import kotlin.math.pow

infix fun Int.`**`(x: Int) = toDouble().pow(x).toInt()

fun main() {
    // optional 또는 null 허용속성은 마지막에 위치시켜야함
    fun addProduct(name: String, price: Double = 1.0, desc: String? = null) {
        println("name = $name")
        println("name = $price")
        println("name = $desc")
    }

    addProduct("name")
    addProduct("name", 5.0)
    addProduct("name", 5.0, "desc")

    val a = 42;
    a.toString(2)

    2.toDouble().pow(8).toInt()
    val b: Int = 42

//    fun Int.pow(x: Int) = toDouble().pow(x).toInt()
    fun Long.pow(x: Int) = toDouble().pow(x).toLong()

    fun Int.pow(x: Int) = `**`(x)

    // 101 -> 10
    5 shr 1

    /// 큰 정수 2개의 중간값 찾기
    val high = (0.99 * Int.MAX_VALUE).toInt()
    val low = (0.75 * Int.MAX_VALUE).toInt()

    val mid1 = (high + low) / 2
    val mid2 = (high + low) ushr 1

    mid1 !in low..high
    mid2 in low..high


    println(4 === 0b0000_0100)
    println(251 === 0b1111_1011)
    println(4.inv())

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    val p1 = Pair("a", 1)
    val p2 = "b" to 2
    println(p1.first)
    println(p1.second)
    println(p2.first)
    println(p2.second)

    val (x, y) = "b" to 3
    println(x)
    println(y)

}