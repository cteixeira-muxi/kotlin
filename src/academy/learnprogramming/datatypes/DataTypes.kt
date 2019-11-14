package academy.learnprogramming.datatypes

import academy.learnprogramming.javacode.DummyClass
import java.math.BigDecimal

fun main() {
    val myInt = 10
    println("Default DataType is ${myInt is Int}")
    var myLong1 = 22L
    val myLong2 : Long = 22

    myLong1 = myInt.toLong()

    val myByte: Byte = 111
    val myShort : Short = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.849f
    println("Default DataType is ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true
    val vacationTime = false
    val onVacation = println(DummyClass().isVacationTime(vacationTime))

    val anything : Any

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) {i -> i *2}
    for(number in evenNumbers)
        print("$number ")
    println()

    val lotsOfNumbers = Array(10) {i -> i + 1}
    printArray(lotsOfNumbers)
//    lotsOfNumbers.forEach { print("$it ") }
//    println()

    val allZeroes = Array(10) { 0 }
    printArray(allZeroes)
//    allZeroes.forEach { print("$it ") }
//    println()

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    printArray(someArray)
//    someArray.forEach { print("$it ") }
//    println()
    someArray = Array(6) {i -> (i+1)*10}
    printArray(someArray)
    DummyClass().printNumbers(someArray.toIntArray())

    val mixedArray = arrayOf("Hello", 22, BigDecimal(10.5), 'a')
    printArray(mixedArray)

    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    DummyClass().printNumbers(someOtherArray)
    printArray(someOtherArray.toTypedArray())
}

fun <T> printArray(arr: Array<T>) {
    print("Array values: ")
    arr.forEach { print("$it ") }
    println()
}
