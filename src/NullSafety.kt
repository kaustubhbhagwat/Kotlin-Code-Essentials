fun main() {
    var gender: String? = null
    var isAdult: Boolean? = null
    var isAdult1: Boolean? = true

//    gender?.let {
//        println("Line1")
//        println("Line2 $gender")
//        println("Line2 $it")
//    }

    val selectedGender = gender ?: "N/A"
}