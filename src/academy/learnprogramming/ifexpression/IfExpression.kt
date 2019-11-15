package academy.learnprogramming.ifexpression

fun main() {

    val someCondition = 69 < 22
    val num = if (someCondition) 50 else 592

    val num2 = if(someCondition) {
        println("something")
        50
    } else {
        println("something else")
        592
    }

    println(num)
    println(num2)

    println(if(someCondition) "Ok" else "Not Ok")

    println("The result of the if expression is: " +
            "${if(someCondition) {
                println("Entered if")
                50
            } else {
                println("Entered else")
                592
            }
    }")
}
