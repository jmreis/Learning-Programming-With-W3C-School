fun myfunction(fname: String) {
    println("$fname doe")
}

fun myfunction1(name: String, age: Int) {
    println("$name is $age")
}

fun myFunction2(x: Int): Int {
    return (x + 5)
}

fun soma(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    myfunction("Jonh")
    myfunction("Jane")
    myfunction1("Jo", 23)
    myFunction2(6)
    soma(123, 432)
}