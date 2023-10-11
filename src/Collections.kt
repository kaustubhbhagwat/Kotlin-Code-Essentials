fun main(){
    val nums : List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)

    nums.forEach { println(it) }

    val userList = listOf(
        User(1,"A"),
        User(2,"B"),
        User(1,"C")
    )

    val paidUserList = userList.map {
        PaidUser(it.id,it.name,"Paid")
    }
    println(paidUserList)
}

data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)

