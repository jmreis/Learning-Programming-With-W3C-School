
class Car {
    var brand = ""
    var model = ""
    var year = 0
}

class Car1(var brand: String, var model: String, var year: Int)
    
    fun drive() {
        println("rooom")
    }

fun main() {
    val c1 = Car()
    c1.brand = "ford"
    c1.model = "mustang"
    c1.year = 1989

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    val c2 = Car1("citroen", "mustang", 1987)
    println(c2.model)
    // c2.drive()

}