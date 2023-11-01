fun main() {
    val onePlus = OnePlus("SmartPhone")
    onePlus.display()

    val generalMobile = Mobile("General")
    generalMobile.display()

    println(onePlus.toString())

}

open class Mobile(type:String){
    open val name: String ="Mobile"
    open val size: Int = 5
    fun makeCall(){println("Making a call")}
    fun powerOff(){println("Shutting Down")}
    open fun display(){println("Simple Mobile Display")}
}

class OnePlus(type: String) : Mobile(type){
    override val name  ="OnePlus"
    override val size  = 6
    override fun display(){
        super.display()
        println("OnePlus")
    }

    

    override fun toString(): String {
        return "Name-> $name , Size-> $size"
    }
}