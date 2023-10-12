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


    val isAbove70 = true
    val knowsPrograming =  false

    var calledForInterview = isAbove70 && knowsPrograming
     calledForInterview = isAbove70 || knowsPrograming

    println(calledForInterview)

    // ShortCircuiting
    var a = 10
    var b = 11

    val result = a==10 || b==11
    println(!result)


}