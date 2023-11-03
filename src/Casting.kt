fun main() {

    val circle4  = Circle4(4.0)
    val player  = Player1("Player is Kaustubh")

    val arr = arrayOf(circle4,player)
    for(obj in arr){
        if(obj is Circle4){
            println(obj.radius)
            println(obj.area())
        }else{
            (obj as Player1).sayMyName()
        }
    }
}

interface Draggable2 {
    fun drag()
}

abstract class Shape4 : Draggable2 {
    abstract fun area(): Double
}

class Circle4(val radius: Double) : Shape4() {
    override fun area() = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Square4(val side: Double) : Shape4() {
    override fun area() = side * side
    override fun drag() = println("Square is dragging")

}

class Triangle4(val base: Double, val height: Double) : Shape4() {
    override fun area() = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

class Player1(val name: String) : Draggable2 {
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("$name is dragging")
}

class Test{

}