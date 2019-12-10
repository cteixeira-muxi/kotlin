package academy.learnprogramming.challenges

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val (fName, lName, age) = joe

    println("fName = $fName, lName = $lName, age = $age")

    val immutablePersonMap = mapOf(joe.lastName to joe,
                                    jane.lastName to jane,
                                    mary.lastName to mary,
                                    john.lastName to john,
                                    jean.lastName to jean)

    println(immutablePersonMap.count { it.value.lastName.startsWith('S') })

    val namePairs = immutablePersonMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    immutablePersonMap.also {
        it.map { println("${it.value.firstName} is ${it.value.age} old.") }
    }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val list3 = list1.intersect(list2)
    val list4 = list1.filter { it in list2 }
    val list5 = list1.filter { list2.contains(it) }
    println(list3)
    println(list4)
    println(list5)

    val regularPaper = Box<RegularPaper>()
    var paper = Box<Paper>()
    paper = regularPaper

}

//class Person(val firstName: String, val lastName: String, val age: Int) {
//
//    operator fun component1() = firstName
//    operator fun component2() = lastName
//    operator fun component3() = age
//
//}
// OR
data class Person(val firstName: String, val lastName: String, val age: Int) {

}

class Box<out T: Paper> {
    val list = listOf<T>()
    fun takePaper(): T = list[0]
}

open class Paper {

}

class RegularPaper: Paper() {

}

class Premium: Paper() {

}
