fun main() {
 val IContainer = Container<Int>(5)
    println(IContainer.getValue())
    IContainer.setValue(10)
    println(IContainer.getValue())

    val SContainer = Container<String>("String")
    add(10,20,30,40)
    add(1,1,1,1,2,3,4,5,)
    println()
}

fun add(vararg values: Int){
    var sum = 0
    for (i in values){
        sum +=i
    }
    println(sum)
}


class Container<T>(var data: T){
    fun setValue(value: T){
        data = value
    }

    fun getValue(): T{
        return data
    }
}
