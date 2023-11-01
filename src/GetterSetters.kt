fun main() {

    val ob = Calculator()// default constructor
    println(ob.add(2,3))
    println(ob.multiply(2,3))

    val person = PersonClass("Kaustubh",30)
    person.age= -31
    println(person.age)
    println(person.name)


}

class Calculator {

    lateinit var msg: String
    fun add(a:Int, b:Int): Int{
        return a+b
    }

    fun multiply(a: Int, b:Int): Int{
        return a*b
    }
}

class PersonClass(nameParam: String, ageParam: Int){
    var name: String = nameParam
        get() {
            return field.toUpperCase()
        }
    var age: Int = ageParam
        set(value) {
            if(value>0){
                field =value
            }
            else{
                println("Age can't be negative")
            }
        }

    var email: String = "Kaustubh"
        get() = field
        set(value) {
            field = value
        }
}