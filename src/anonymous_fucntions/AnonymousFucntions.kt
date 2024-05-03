package anonymous_fucntions

// 1- With Parameters and Return Value:
 val myVariable: (a:String,b:String)-> String = fun(a,b):String{
        return "$a $b"
    }

// 2- With Parameters and No Return Value:

val myVariable2: (a:String,b:String) -> Unit = fun(a,b){
    println("$a $b")
}

// 3- No Parameters and No Return Value:
val myVariable3 = fun():Unit{
    println("No parameters , No Return Value")
}

// 4- No Parameters and Return Value:

val myVariable4 = fun() :String{
    return "Hi"
}

fun main() {
    println(myVariable("Kaustubh","Bhagwat"))
    myVariable2("Kaustubh","Bhagwat")
    myVariable3()
    println(myVariable4())
}

