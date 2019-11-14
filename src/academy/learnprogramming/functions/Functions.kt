package academy.learnprogramming.functions

fun main() {
    println(labelMultiply(operand2 = 3, operand1 = 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("Blue", "Toyota", 2015)
    val car2 = car1.copy(color = "Red")
    val car3 = car1.copy(color = "Grey")

    printColors(car1, car2, car3)

    val numbers = arrayOf(1, 2, 3)
    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)

    val lotsOfCars = arrayOf(car1, car3, *manyCars)
    printColors(*lotsOfCars)

    println("this is all in lowercase".upperFirstAndLast())

}

fun String.upperFirstAndLast() : String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is:") =
    "$label ${operand1 * operand2}"

fun printColors(vararg cars: Car) {
    for (car in cars)
        println(car.color)
}

class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()

}

data class Car(val color: String, val model: String, val year: Int) {}
