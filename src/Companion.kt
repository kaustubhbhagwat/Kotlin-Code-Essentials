fun main() {
    MyClass.f()
    MyClass.AnotherObject.g()
}

class MyClass {
    companion object MyObject{
        fun f() = println("Hello from f function")
    }

    object AnotherObject {
        fun g() = println("Hello from G from another object g function")
    }
}