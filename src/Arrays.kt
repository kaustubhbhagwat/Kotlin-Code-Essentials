fun main() {

    var arr = arrayOf("One","Two","Theee")
    var arr1 = arrayOf(1,2,3)
    var arr12= arrayOf<Int>(1,2,3)

    for ((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    println(arr[0])
    println(arr.get(1))
    println(arr.set(0,"Hello"))
    println(arr.size)

}