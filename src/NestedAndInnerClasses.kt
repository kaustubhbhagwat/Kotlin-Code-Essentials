fun main() {

    val outer = Outer()
    outer.i
    val nested = Outer.Nested()
    nested.test()
    val innerClass = outer.Inner()
    innerClass.test()

}

class Outer {

    var i = 0

    class Nested {

        fun test() {
            println("I am nested class")
        }
    }
    inner class Inner {

        fun test() {
            println("I am inner class $i")
        }
    }
}