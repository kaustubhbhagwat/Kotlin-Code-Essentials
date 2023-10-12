fun main() {

    var i = 13
    var j = 2

    println( i + j)
    println( i - j)
    println( i * j)
    println( i.toFloat() / j)

    println(i > j) // true
    println( i < j) // false
    println( i >= j) // true
    println( i <= j) // false
    println( i == j) // false
    println( i != j) // true

    var k = 10

    //pre increment
    ++k
    println(k)
    //post increment
    k++
    println(k)

    println(k++ + ++k)
}