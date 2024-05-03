package lambdas

val add: (Int,Int)-> Int = {a,b -> a+b }

val subtract = {a:Int, b:Int -> a-b}

val multiply: (Int,Int) ->Int = {a:Int,b:Int -> a*b}

val divide: (Int,Int) ->Int= {a:Int,b:Int -> a/b }

val square: (Int)-> Int = { it * it }

val cube :( Int)->Int = {it * it * it}

//val myVariable : (Int, String) -> String = {a: Int, b: String -> "$a +$b"}

//Shorter syntax of 2 types
//val myVariable1  = {a: Int, b: String -> "$a +$b"}
//
//val myVariable2 : (Int, String) -> String = {a, b -> "$a +$b"}

//There are four function types, varying based on parameters and return types.

// 1-With Parameters and No Return Value:
val myVariable :(Int,String) -> Unit = {a:Int,b:String -> println("$a + $b")}

// 2-With Parameters and Return Value:
val myVariable1 :(Int,String) ->String = { a:Int , b:String -> "$a + $b" }

// 3-No Parameters and No Return Value:
val myVariable2:() -> Unit = { println("No parameters , No return Value")}

// 4-No Parameters and Return Value:
val myVariable3:() ->String = {"No parameters and Holding return value"}
val myVariable4: () -> String = { "Return String" }





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
    myVariable(1,"A")
    println(myVariable1(1,"A"))
    println(myVariable2)
    myVariable3
    myVariable4

    // A variable isn't always necessary, as lambda expressions can be used directly.
    println({a:String,b:String -> "$a $b"}("Kaustubh","Bhagwat"))
}