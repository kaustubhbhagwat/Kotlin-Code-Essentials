fun main() {
    val shape: Shape = Shape()
    printArea(shape)
    
    val square: Square = Square(4.0)
    printArea(square)

    val circle1: Circle1 = Circle1(4.0)
    println(circle1.toString())
}

fun printArea(shape: Shape) {
    println(shape.area())
}

open class Shape1 {
    open fun area(): Double = 0.0
    override fun toString(): String {
        return "I am Shape"
    }
}

class Circle1(val radius: Double): Shape1() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}