package academy.learnprogramming.lambdas

fun main() {
//    run { println("I'm a lambda!") }
//
    val employees = listOf(Employee("John", "Smith", 2012),
                          Employee("Jane", "Wilson", 2015),
                          Employee("Mary", "Johnson", 2010),
                          Employee("Mike", "Jones", 2002))
//
//    println(employees.minBy(Employee::startYear))
//    println(employees.minBy { it.startYear })
//
////    var num = 10
////    run {
////        var num2 = 20
////        num += 15
////        println(num)
////    }
//
//    run(::topLevel)
    println(countTo100Apply())
    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    "Some String".apply someString@ {
        "Another String".apply {
            println(toLowerCase())
            println(this@someString.toUpperCase())
        }
    }
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if(it.lastName == lastName) {
            println("Yes, there's and employee with the last name $lastName")
            return@returnBlock
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append("$i, ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100With() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append("$i, ")
        }
        append(100).toString()
    }

fun countTo100Apply() =
    StringBuilder().apply {
        for (i in 1..99) {
            append("$i, ")
        }
        append(100)
    }.toString()

fun topLevel() = println("I'm in a function!")

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}
