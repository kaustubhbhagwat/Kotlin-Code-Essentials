package lambdas

val add: (Int,Int)-> Int = {a,b -> a+b }

val subtract = {a:Int, b:Int -> a-b}

val multiply: (Int,Int) ->Int = {a:Int,b:Int -> a*b}

val divide: (Int,Int) ->Int= {a:Int,b:Int -> a/b }

fun main() {
    println(add(1,2))
    println(subtract(1,2))
    println(multiply(1,2))
    println(divide(1,2))
}