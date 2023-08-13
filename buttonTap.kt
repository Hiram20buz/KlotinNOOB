class Button(var width: Int, var height: Int, var name: String) {
    fun tap(): String {
        return "$name was tapped"
    }
}

fun main(args: Array<String>) {
    val b1 = Button(200, 50, "Send")
    b1.name = readLine()!!

    val tapResult = b1.tap()
    println(tapResult)
}
