import kotlin.math.pow

fun main() {

    println(sum(2.0, 3.0))
    println(power1(2.0, 3.0))

    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.5, 3.0))
    calculator(5.0, 6.0, ::sum)

    val lambda1 = { x: Int, y: Int -> x + y }
    val multiLineLambda = {
        println("Hello")
        val a = 2 + 3
        "Hello World"
        2
    }

    println(multiLineLambda())

    val singleParamlambda = { x: Int -> x * x }
    val singleParamlambda2: (Int) -> Int = { x -> x * x }
    println(singleParamlambda(2))
    println(singleParamlambda2(5))

    val sayHi = { msg: String -> println("Hello $msg") }
    println(sayHi("Kaustubh"))

    val singleParam3: (Int) -> Int = { x -> x + x }
    val singleParam4: (Int) -> Int = { it + it }
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power1(a: Double, b: Double): Double {
    return a.pow(b)
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}



