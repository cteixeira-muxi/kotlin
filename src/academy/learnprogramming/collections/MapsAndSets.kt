package academy.learnprogramming.collections

fun main() {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.minus(100))
    println(setInts.plus(20).minus(10).average())
    println(setInts.drop(3))

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    mutableInts.plus(10)
    println(mutableInts)
    mutableInts.add(10)
    println(mutableInts)

    val immutableMap = mapOf(1 to Car("green", "Toyota", 2015),
                            2 to Car("red", "Ford", 2016),
                            3 to Car("silver", "Honda", 2013))

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf("John's car" to Car("red", "Range Rover", 2010),
                                "Jane's car" to Car("blue", "Hyundai", 2012))

    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap["Mary's car"] = Car("red", "Corvette", 1965)

    for((key, value) in mutableMap) {
        println(key)
        println(value)
    }

    val pair = Pair(10, "ten")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)

    val car = Car("blue", "Corvette", 1959)
    val (c, m, y) = car
    println("color = $c, model = $m, year = $y")

}

data class Car(val color: String, val model: String, val year: Int) {

//    data classes have the following declarations for free, as it does with override toString and equals
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year

}
