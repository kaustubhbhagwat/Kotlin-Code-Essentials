fun main() {
val emp = Employee()
    emp.age = 20
    emp.name = "Kaustubh"

    emp.apply {
        name = "Kb"
        age = 20
    }
    println(emp)

    emp.let {
        println(it.name)
        println(it.age)
    }

    with(emp){
        name = "ABC"
        age = 30
    }
    println(emp)

    emp.run {
        age = 35
        name = "PQR"
    }

    println(emp)
}

data class Employee(var name: String ="", var age: Int= 18)