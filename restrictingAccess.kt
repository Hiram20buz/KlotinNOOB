open class Component(protected var width: Int, protected var height: Int) {
    fun getComponentWidth(): Int {
        return width
    }

    fun setComponentWidth(newWidth: Int) {
        width = newWidth
    }

    fun getComponentHeight(): Int {
        return height
    }

    fun setComponentHeight(newHeight: Int) {
        height = newHeight
    }
}

class Button(width: Int, height: Int) : Component(width, height) {
    private var name: String = "Button"
    internal fun tap() {
        println("$name was tapped")
    }
}

class Image(width: Int, height: Int) : Component(width, height) {
    fun draw() {
        println("$width x $height")
    }
}

fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}
