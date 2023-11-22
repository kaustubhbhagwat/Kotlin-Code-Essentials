import kotlin.math.pow

fun main(){

    println(sum(2.0,3.0))
    println(power1(2.0,3.0))

    var fn : (a: Double, b: Double) -> Double = ::sum
    println(fn(2.5,3.0))
    calculator(5.0,6.0, ::sum)
}

fun sum( a:Double, b: Double):Double{
    return a+b
}

fun power1(a:Double, b:Double): Double{
    return a.pow(b)
}

fun calculator(a: Double, b: Double, gn: (Double,Double)->Double){
    val result = gn(a,b)
    println(result)
}

