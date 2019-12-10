package academy.learnprogramming.usesitevariance

fun main() {

    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()

    val toyotas1 = mutableListOf(Toyota(), Toyota())
    val toyotas2: MutableList<Toyota> = mutableListOf()
    copyCars(fords1, fords2)

    copyCars(fords1, cars2)

    val cars3: MutableList<Car> = mutableListOf(Ford(), Ford())
}

fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<in T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car {

}

class Toyota: Car() {

}

class Ford: Car() {

}
