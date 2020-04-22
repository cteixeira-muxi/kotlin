package academy.learnprogramming.iokotlin

import java.io.File

fun main() {

    val reader = File("testfile.txt").reader()
    val lines = reader.readText()
    println(lines)
    reader.close()

    File("testfile.txt").bufferedReader().use { println(it.readText()) }

    File("testfile.txt").reader().forEachLine { println(it) }
}
