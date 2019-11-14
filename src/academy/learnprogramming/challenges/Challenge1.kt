package academy.learnprogramming.challenges

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var number = 2988
    val obj : Any = "The Any type is the root of the Kotlin class hierarchy"
    if(obj is String)
        println(obj.toUpperCase())

    """   1|  11| 111|1111""".split("|").forEach{println(it)}

    println("""   1
              |  11
              | 111
              |1111""".trimMargin())
}
