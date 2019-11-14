package academy.learnprogramming.accessmodifiers

val MY_CONSTANT = 100

fun main() {

//    val employee = Employee("John")
//    val emp = Employee("John")
//    println(employee == emp)
//
//    println(employee.firstName)
//    println(employee.fullTime)
//
//    employee.fullTime = false
//    println(employee.fullTime)
//
//    val employee2 = Employee("Joe", false)
//    println(employee2.firstName)
//    println(employee2.fullTime)
//
//    println(Demo().dummy)
//
//    println(MY_CONSTANT)

    val car = Car("blue", "Toyota", 2015)
    println(car)

    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2)

    val car3 = car.copy()
    val car4 = car.copy(year = 2016)
    println(car3)
    println(car4)
}

data class Car(val color: String, val model: String, val year: Int) {

}

class Employee(val firstName : String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }

    set(value) {
        println("Runnin the custom set")
        field = value
    }
}

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}
