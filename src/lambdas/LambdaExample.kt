package lambdas

val add: (Int,Int)-> Int = {a,b -> a+b }

val subtract = {a:Int, b:Int -> a-b}

val multiply: (Int,Int) ->Int = {a:Int,b:Int -> a*b}

val divide: (Int,Int) ->Int= {a:Int,b:Int -> a/b }

val square: (Int)-> Int = { it * it }

val cube :( Int)->Int = {it * it * it}

val myVariable : (Int, String) -> String = {a: Int, b: String -> "$a +$b"}

//Shorter syntax of 2 types
val myVariable1  = {a: Int, b: String -> "$a +$b"}

val myVariable2 : (Int, String) -> String = {a, b -> "$a +$b"}



val lambdaAbbreviate: String.() -> String ={
    val splitString = this.split(" "," ", ignoreCase = true)
    var abbrevition: StringBuilder? = StringBuilder("")
    for (word in splitString){
        abbrevition?.append(word[0])
    }
    abbrevition.toString().toUpperCase()
}

fun main() {
    println(add.invoke(1,2))
    println(subtract(1,2))
    println(multiply(1,2))
    println(divide(1,2))
    println("Square of the number is ${square(5)}")
    println(lambdaAbbreviate("Kaustubh Bhagwat"))
    println(myVariable(1,"A"))
    println(myVariable1(1,"A"))
    println(myVariable2(1,"A"))


}