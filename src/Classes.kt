fun main() {

    val mustang = Car("Mustang","Petrol", 200)
    val beetle = Car("beetle","Petrol", 300)

    println(mustang.name+"is ${mustang.type}")
    println(mustang.driveCar())
    println(beetle.driveCar())

    println(beetle.applyBrakes(beetle.name))

}

class Car(val name: String , val type: String, val kmRan: Int){

    fun driveCar(){
        println("$name Car is Driving")
    }

    fun applyBrakes(name: String) {
        println("$name Applied Brakes")
    }
}