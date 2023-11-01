fun main() {

    val car = Automobile("Car", "Petrol")
    val car2 = Automobile("Car2",  "Diesel")
    println(car)
    println(car2)

    val person1 = Person1("Kaustubh",30)
    println(person1.name)
    println(person1.age)
    println(person1.canVote)
}


//Primary Constructor
class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String) {

    constructor(nameParam: String,engineTypeparam: String) : this(nameParam,4,5,engineTypeparam)

    init {
        println("$name is created")
    }

    init {
        print("2nd Initializer block")
    }
    fun driveCar() {}
    fun applyBrakes() {}
}

private class Person1(nameParam:String,ageParam: Int) {
    val name: String = "Hello $nameParam your age is "
    val age: Int = ageParam
    var canVote :Boolean = ageParam >18
}