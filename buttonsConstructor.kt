class Button {
    var width = 0
    var height = 0
    
    constructor(width: Int, height: Int) {
        this.width = width
        this.height = height
    }
}

fun main(args: Array<String>) {
    val b1 = Button(readLine()!!.toInt(), readLine()!!.toInt())
    
    println(b1.width * b1.height)
}
