fun main(args: Array<String>) {
    var age = readLine()!!.toInt()
    when{
        age < 0 -> println("Invalid age")
        age <= 11 -> println("Child")
        age <= 17 -> println("Teen")
        age <= 64 -> println("Adult")
        else -> println("Senior")

    }
}
