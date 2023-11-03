fun main() {
    println(A1.num)
    B1.test()
    println(B1.num2)

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.display()
}

object A1 {
    val num: Int = 10

    init {
        println("Init Block")
    }
}

object B1 {
    val num2: Int = 20
    fun test() {
        println("I am a object")
    }
}

object SharingWidget{
   private var twitterLikes = 0
   private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFbLikes() = fbLikes++
    fun display() =  println("Facebook - $fbLikes -- Twitter - $twitterLikes")

}
