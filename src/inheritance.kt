fun main() {
    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
}

open class Parent{
    init {
        println("Parent Constructor us called")
    }
    val name: String = ""
    fun myMethod(){
        println("I am Parent")
    }
}

class Child: Parent(){

    init {
        println("Child Constructor us called")
    }
    val name2: String =""
    fun myMethod2(){
        println("I am a Child")
    }
}