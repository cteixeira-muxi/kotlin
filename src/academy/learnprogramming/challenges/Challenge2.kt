package academy.learnprogramming.challenges

fun main() {
    val myFloat: Float? = -3847.384f
    val myFloat2: Float? = (-3847.384).toFloat()

    val arrayOfShorts1 = Array<Short> (5) { i -> (i+1).toShort() }
    val arrayOfShorts2 = shortArrayOf(1, 2, 3, 4, 5)
    val arrayOfShorts3: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    val arrayOfNullableInts = Array<Int?>(40) { i -> (i+1)*5 }
    val charArray = charArrayOf('a', 'b', 'c')

    val x: String? =  "I AM IN UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"
    println(y);

    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    val myNonNullVariable: Int? = null
    println(myNonNullVariable?.toDouble())
}

