package academy.learnprogramming.challenges

fun main() {

    val bike = KotlinBicycle(10, 3, 10)
    val mountainBike = KotlinMountainBike(20, 10, 10, 30)
    val roadBike = KotlinRoadBike(10, 10, 10, 3)

    val listOfBikes = arrayOf(bike, mountainBike, roadBike)
    listOfBikes.forEach { it.printDescription() }

    println()
    val bike2 = KotlinBicycle(10, 3)
    val mountainBike2 = KotlinMountainBike(20, 10, 10)
    val roadBike2 = KotlinRoadBike(10, 10, 3)

    val listOfBikes2 = arrayOf(bike2, mountainBike2, roadBike2)
    listOfBikes2.forEach { it.printDescription() }

    val mountainBike3 = KotlinMountainBike("Green",20, 10, 10)
    mountainBike3.printDescription()
    KotlinMountainBike.availableColors.forEach{ println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence " +
                                        "travelling at a speed of $speed.")

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            KotlinBicycle(cadence, speed, gear) {

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    lateinit var color: String

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            this(seatHeight, cadence, speed, gear) {
        this.color = color
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
        if(::color.isInitialized)
            println("It's color is $color")
    }

}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10):
            KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}
