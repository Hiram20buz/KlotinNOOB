fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    println("Original numbers: $numbers")

    val squaredNumbers = applyFunction(numbers) { it * it }

    println("Squared numbers: $squaredNumbers")
}

fun applyFunction(numbers: List<Int>, operation: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        result.add(operation(number))
    }
    return result
}
