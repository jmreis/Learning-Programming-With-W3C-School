// Superclass
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myfunction() {
        println(x)
    }
}

fun main() {
    val myobj = MyChildClass()
    myobj.myfunction()
}