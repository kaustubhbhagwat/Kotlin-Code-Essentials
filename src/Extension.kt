fun main() {
    println("Hello Kaustubh".formattedString())
    calculateTime()
    calculateTime()
    calculateTime()
}

fun String.formattedString(): String{
    return "-------\n$this\n-----"
}


inline fun calculateTime(){
    val start = System.currentTimeMillis()
    loop(100000)
    val end = System.currentTimeMillis()
    println("Time taken is ${end -start} ms")
}

fun loop(n: Long){
    for(i in 1..n){

    }
}





