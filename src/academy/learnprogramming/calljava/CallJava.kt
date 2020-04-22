package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car

fun main() {

    val car = Car("blue", "Ford", 2015)
    car.color = null
    println(car)

    var model = car.model
    println(model.javaClass)
    model = null
//    println(model)

    val color: Int = car.color
}
