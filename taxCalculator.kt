fun main(args: Array<String>) {
    val price = readLine()!!.toDouble()
    println(calc(price))
}

fun calc(price: Double): Double {
    return price + 0.15 * price
}
