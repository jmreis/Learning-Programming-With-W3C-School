fun main(args: Array<String>) {
    val cars = arrayOf("volvo", "bmw", "ford", "mazda")
    cars[0] = "opel"
    println(cars[0])

    println(cars.size)

    if ("volvo" in cars) {
        println("exists")
    } else {
        println("it does not exists")
    }

    for (x in cars) {
        println(x)
    }

    val nums = arrayOf(1, 2, 3, 4, 5, 6)
    for (x in nums) {
        println(x)
    }

    // Ranges
    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 5..15) {
        println(nums)
    }


}
