package academy.learnprogramming.trycatch

import kotlin.NumberFormatException

fun main() {
    println(getNumber("22.5") ?: "I can't print the result")
    notImplementedYet("test")
}

fun notImplementedYet(str: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNumber(str: String) =
    try {
        Integer.parseInt(str)
    } catch(e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
        1 // Not used. The function returns either the try block value or the catch block value, despite of executing finally block
    }
