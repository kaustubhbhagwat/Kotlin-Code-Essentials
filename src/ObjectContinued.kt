fun main() {
var testObj = object {
    val x: Int = 10
    fun method(){
        println("I am an object expression")
    }
}
    println(testObj.x)
    testObj.method()

    val obj = object: Cloneable{
        override fun clone() {
            println("I am a clone")
        }

    }
    obj.clone()

    // Anonymous Class
    val obj2 = object : Person2("Kaustbh Bhagwat"){
        override fun fullName() {
            super.fullName()
            println("Anonymous - $name")
        }
    }
}

interface Cloneable{
    fun clone()
}

open class Person2(val name: String){
    open fun fullName() = println("Full name ----> $name")
}

