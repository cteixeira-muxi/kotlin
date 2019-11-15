package academy.learnprogramming.anotherpackage

import academy.learnprogramming.communications.CompanyCommunications as Comm
import academy.learnprogramming.communications.topLevel as tp
import academy.learnprogramming.communications.Department.*

fun main() {
    tp("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
}
