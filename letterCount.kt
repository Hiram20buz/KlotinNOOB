fun main(args: Array<String>) {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}

fun letter_count(letter: Char, text: String): Int {
    var total = 0
    for (char in text) {
        if (char == letter) {
            total += 1
        }
    }
    return total
}
