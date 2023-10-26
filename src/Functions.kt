fun main() {

    val result = add(1,2)
    println(result)

    val result2 = add(5,6)
    println(result2)

    evenOrOdd(10)
    evenOrOdd(11)

    printMsg()
}

fun printMsg(count: Int = 2){
    for (i in 1..count){
        println("Hello $i")
    }
}

fun add(num1: Int, num2: Int) = num1 + num2

fun evenOrOdd(num1: Int) {
    val result = if(num1%2==0) "Even" else "Odd"
    println(result)
}