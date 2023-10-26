fun main() {

    println(addition(a=1,b=10))
    println(addition(1.0,2.0))

}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun addition(a: Double, b: Double):Double {
    return a + b
}