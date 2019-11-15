package academy.learnprogramming.whenexpression

import java.math.BigDecimal

enum class Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}

fun main() {

    val timeOfYear = Season.SPRING
    val str = when (timeOfYear) {
        Season.SPRING -> "Flowers are blooming"
        Season.SUMMER -> "It's hot!"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> "I need a coat"
    }

    println(str)

    val num = 100

    when(num) {
        in 100..199 -> println("in range 100..199")
        200 -> println("200")
        300 -> println("300")
        else -> println("Didn't match anything")
    }

    val y = 10

    when(num) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("Didn't match anything")
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2

    val z = when(something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder((BigDecimal(10.5))))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            println("I have no idea what type this is")
            4
        }
    }

    println(z)

    val num2 = -50

    when {
        num < num2 -> println("num is lesser than num2")
        num > num2 -> println("num is greater than num")
        else -> println("num = num2")
    }
}
