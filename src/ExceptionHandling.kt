fun main() {
    val arr = arrayOf(1,2,3)
    try{
        println(arr[5])
    }
    catch(e: NullPointerException){
        println(e)
    }
    catch (e: Exception){
        println("Array out of bounds, please check")
    }
    finally {
        println("Array size is ${arr.size}")
    }
    createUserList(5)
}

fun createUserList(count: Int){
    if (count<0){
        throw IllegalAccessException("Count must be greater thatn 0")
    }else{
        println("UserList created with count $count")
    }

}