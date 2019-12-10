package academy.learnprogramming.generics

import java.lang.Appendable

fun main() {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, null, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3", "4")

    if(strings is List<String>) {
        println("This list contains strings")
    }

    val listAny: Any = listOf("str1", "str2")
    if(listAny is List<*>) {
        println("Yes, this is a list.")
        println("This list contains strings")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

//    shorts.printCollection()
    strings.printCollection()

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

}

fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        print("${num?.toInt()} ")
    }
    println()
}
