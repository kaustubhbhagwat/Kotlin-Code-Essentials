fun main() {
    var count =5
    while(count>=1){
        println("Hello kb")
        count --
    }

    var number = 2
    var index = 1
    while (index<=10){
        println(number * index)
        index++
    }

    var index2 = 5
    do {
        println("Hello this is do-while")
    }while (index2>5)

    // upper bound included
    for (i in 1..5 step 2){
        println(i)
    }

    //upper bound not included
    for(i in 1 until 5){
        println(i)
    }

    for(i in 10 downTo 1 step 2){
        println(i)
    }

    val value = 2
    for(i in 1..10){
//        println(value.toString() + "x" + i +"=" + (value * i))
        //string templating
        println("$value + x $i = ${value*i}")
    }
}