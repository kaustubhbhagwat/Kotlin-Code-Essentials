fun main() {

    var i :Int = 20

    println(i.plus(20))
    println(i.toFloat())

    val mustang = Car("Mustang","Petrol", 200)
    val beetle = Car("beetle","Petrol", 300)

    println(mustang.name+"is ${mustang.type}")
    println(mustang.driveCar())
    println(beetle.driveCar())

    println(beetle.applyBrakes(beetle.name))

    val p1 = Person("A",21)
    val p2 = Person("B",12)

    println(p1.canVote())
    println(p2.canVote())
}

class Person(val name: String, var age: Int){
    fun canVote(): Boolean{
        return age > 18
    }
}

class Car(val name: String , val type: String, val kmRan: Int){

    fun driveCar(){
        println("$name Car is Driving")
    }

    fun applyBrakes(name: String) {
        println("$name Applied Brakes")
    }
}