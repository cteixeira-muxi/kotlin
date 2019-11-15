
package academy.learnprogramming.loops

import academy.learnprogramming.inheritance.LaserPrinter

fun main() {

//    val range = 1..5
//    for (i in range) // for (i in 1..5)
//        print("$i ")
//    println()
//
//    val charRange = 'a'..'z'
//    val stringRange = "ABC".."XYZ"
////    println(3 in range)
////    println('q' in charRange)
////    println("CCC" in stringRange)
////    println("CCCCCC" in stringRange)
////    println("ZZZZZZ" in stringRange)
//
//    val backwardsRange = 5.downTo(1)
////    println(5 in backwardsRange)
//
//    val stepRange = 3..15
//    for(n in stepRange)
//        print("$n ")
//    println()
//
//    val stepThree = stepRange.step(3)
//    for (n in stepThree)
//        print("$n ")
//    println()
//
//    val reversedRange = range.reversed()
//    for (i in reversedRange)
//        print("$i ")
//    println()
//
//    val str = "Hello"
//    for (c in str)
//        print("$c ")
//    println()
//
//    for (num in 20 downTo 1 step 5)
//        print("$num ")
//    println()
//
//    for (i in 1 until 10)
//        print("$i ")
//    println()
//
//    val seasons = arrayOf("spring", "summer", "winter", "fall")
//    for (index in seasons.indices)
//        println("${seasons[index]} is season number $index")
//
////    val notASeason = "whatever" !in seasons
////    println(notASeason)
////
////    val notInRange = 32 !in 1..10
////    println(notInRange)
//
//    seasons.forEach { print("$it ") }
//    println()
//    seasons.forEachIndexed { index, value -> println("$value is season number $index") }
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for(k in 5..10) {
                println("k = $k")
                if(k == 7)
                    continue@jloop
            }
        }
    }

}
