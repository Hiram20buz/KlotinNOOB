fun main(args: Array<String>) {
    val sum: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }

    val result = sum(5, 3)
    println("Sum: $result")
}
