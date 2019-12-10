package academy.learnprogramming.generics

import java.math.BigDecimal

fun main() {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-5938.393849))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)
    bigDecimalsOnly.printCollection()

    val list = mixedList.filterIsInstance<String>()
    list.printCollection()
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    val newList: MutableList<T> = mutableListOf()
    for(element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}
