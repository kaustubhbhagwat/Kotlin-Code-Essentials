fun main() {
    //Abstract class cannot be instantiated
    val circle2: Circle2 = Circle2(4.0)
    println(circle2.area())
    circle2.display()

}

//Abstract class and functions are open by default
//Abstract class can contain non-abstract functions and properties
// If a class has a abstract function of property then that class must be declared abstract
abstract class Shape2 {
    var name: String = ""
    abstract fun area(): Double
    abstract fun display()
}

class Circle2(val radius: Double) : Shape2() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun display() = println("Circle is getting displayed")
}