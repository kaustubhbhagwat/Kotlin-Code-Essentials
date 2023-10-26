fun main() {
    val animal = "Dog"

    val result =   when(animal){
        "Horse"->  "Animal is Horse"
        "Dog"->  "Animal is Dog"
        "Cat"->  "Animal is Cat"
        else -> "Animal not found"
    }
    println(result)
}