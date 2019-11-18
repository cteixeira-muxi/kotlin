package academy.learnprogramming.challenges

fun main() {

    val range = 5..5000
    range.step(5)

    for(i in 5..5000 step 5)
        println(i)

    for(i in -500..0)
        println(i)

    var total: Int
    var secondToLast = 0
    var last = 1
    print("$secondToLast, $last, ")

    val rangeFib = 1..13
    for (i in rangeFib) {
        total = secondToLast + last
        print(
            if(rangeFib.last != i)
                "$total, "
            else
                "$total"
        )
        secondToLast = last
        last = total
    }
    for (i in 1..5) {
        println(i)
        loopj@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                if(k != 90)
                    print("$k ")
                else {
                    print("$k\n")
                    continue@loopj
                }
            }
        }
    }

    val num = 123

    println(when {
                num > 100 -> -234.567
                num < 100 -> 4444.555
                else -> 0.0
            })
}
