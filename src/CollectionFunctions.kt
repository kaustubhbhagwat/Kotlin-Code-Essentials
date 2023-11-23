fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    println(isOddNumber(2))
    println(isOddNumber(3))

    val list = nums.filter(::isOddNumber)
    val list2 = nums.filter(fun(a: Int): Boolean {
        return a % 2 != 0
    })

    val lambdaList = nums.filter { it % 2 != 0 }
    println(list)
    println(list2)
    println(lambdaList)

    val userList = listOf(
        NewUser(1, "A"),
        NewUser(2, "B"),
        NewUser(3, "C")
    )

    println(userList.filter { it.id == 2 })

    val mapList = nums.map { it * it }
    println(mapList)

    val paidUserList = userList.map {
        PaidUsr(it.id,it.name,"PAID")
    }

    println(paidUserList)

    nums.forEach { println(it) }

}

fun isOddNumber(a: Int): Boolean {
    return a % 2 != 0
}

data class NewUser(val id: Int, val name: String)

data class PaidUsr(val id: Int, val name: String , val type: String)
