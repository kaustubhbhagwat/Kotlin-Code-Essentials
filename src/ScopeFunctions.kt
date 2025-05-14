fun main() {

    // let
    var letVariable = Person4("Kasutubh","Bhagwat","Ind", 31).let {
        it.lastName + it.name
    }
    println(letVariable)

    // run
    var runVariable =  Person4("Kasutubh","Bhagwat","Ind", 31).run {
        this.name
    }
    println(runVariable)

    //with
    var withVariable =  with (Person4("Kasutubh","Bhagwat","Ind", 31)) {
        this.lastName
    }
    println(withVariable)

    //apply
    var applyVariable =   Person4("Kasutubh","Bhagwat","Ind", 31).apply {
        this.nationality.reversed()
    }
    println(applyVariable)

    //also
    var alsoVariable = Person4("Kasutubh","Bhagwat","Ind", 31).also {
            it.age
    }
    println(alsoVariable)
}


private data class Person4(val name: String ="", val lastName: String ,val nationality:String , val age: Int)