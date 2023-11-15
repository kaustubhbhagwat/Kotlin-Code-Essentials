fun main() {


    val day = Day.MONDAY
    println(day)
    for( i in Day.values()){
        println(i)
    }
    day.printFormattedDay()
}

enum class Day(private val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay(){

        println("Day is $this and number is $number")

    }

}

