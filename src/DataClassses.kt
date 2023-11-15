fun main() {

    val p3 = Person3(1,"John")
    val p4 = Person3(1,"Kb")

    val p5 = p4.copy(5, "Abc")
     println(p5)
    println(p3) // toString()
    println(p4)
    println(p3.hashCode())
    println(p3 == p4)

    val (id, name) = p3
    println(id)
    println(name)
    println(p3.component1())
    println(p3.component2())

}

data class Person3(val id: Int , val name: String){
}