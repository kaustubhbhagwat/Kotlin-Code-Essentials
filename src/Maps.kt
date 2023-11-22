fun main() {

    // Mutable map
    val students = mutableMapOf<Int,String>()
    students.put(1,"Ryan")
    students.put(2,"John")
    students.put(3,"Kate")
    println(students[1])

    for((key,value) in students){
        println("$key : $value")
    }


    students[8] = "New Value"
    println(students[8])
    println(students)

    
    // Immutable Map
    val map = mapOf<Int,String>(1 to "Hello", 2 to "World")
    println(map)

}