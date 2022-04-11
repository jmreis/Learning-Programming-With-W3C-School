fun main() {
    val x = 20
    val y = 18

    if (x > y) {
        println("x is greater than y")
    }

    val time = 22
    if (time < 10) {
        println("good morning")
    } else if (time < 20) {
        println("good day")
    } else {
        println("good evening")
    }

    val time1 = 20
    val greeting = if (time < 18) {
        "good day"
    } else {
        "good evening"
    }

    println(greeting)

    val time2 = 20
    val greeting1 = if (time < 18) "good day" else "good evening"
    println(greeting1)

    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
    
}

