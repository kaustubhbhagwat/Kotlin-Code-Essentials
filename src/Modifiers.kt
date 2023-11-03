fun main() {

    val a = A()
    val b = B()
    b.test()
}

 open class A{
   public var a = 10
    private var b = 20
    internal var c = 30
    protected var d = 40
}

class B : A(){
    fun test() {
        println(a)
       // println(b) Private variable not accessible
        println(c)
        println(d)

    }
}