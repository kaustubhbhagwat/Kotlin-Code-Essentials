fun main() {
    val isRaining = true

    if (isRaining) {
        println("Take a umbrella")
    } else {
        println("No Rain! Enjoy your day")
    }

    val x = 10
    val y = 10

    var result =  if (x > y) {
        ("X is Greater")
    } else if (y > x) {
        ("Y is Greater")
    } else {
        ("X is equal to Y")
    }
    println(result)

    val number = 21
    result = if(number % 2 == 0) "Even" else "Odd"
    println(result)
} 