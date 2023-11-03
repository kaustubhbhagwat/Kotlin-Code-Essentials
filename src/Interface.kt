import java.util.Objects

fun main() {
    dragObjects(arrayOf(Circle3(4.0), Square3(3.0), Triangle3(4.0, 5.0), Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>) {
    for (obj in objects) {
        obj.drag()
    }
}

// Class can implement multiple interfaces
// Group objects on the basis of what they can do rather than what they are
// To use polymorphism in unrelated set of classes(i.e. classes that do not belong to the same inheritance hierarchy)
// Interface can also be called as a contract
interface Draggable {
    fun drag()
}

abstract class Shape3 : Draggable {
    abstract fun area(): Double
}

class Circle3(val radius: Double) : Shape3() {
    override fun area() = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Square3(val side: Double) : Shape3() {
    override fun area() = side * side
    override fun drag() = println("Square is dragging")

}

class Triangle3(val base: Double, val height: Double) : Shape3() {
    override fun area() = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

class Player(val name: String) : Draggable {
    override fun drag() = println("$name is dragging")
}




