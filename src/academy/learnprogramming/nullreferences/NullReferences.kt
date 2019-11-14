package academy.learnprogramming.nullreferences

import academy.learnprogramming.datatypes.printArray

fun main() {

    val str: String? = "This isn't null"
    println(str?.toUpperCase())

    val nullStr: String? = null
    println(nullStr?.toUpperCase())

    if(nullStr == null) {
        null
    }
    else {
        nullStr.toUpperCase()
    }

    val bankBranch = BankBranch(null)

    val countryCode: String? = bankBranch?.address?.country?.countryCode ?: "BRA"
    println(countryCode)

    val str2 = nullStr ?: "This is the default value"
    println(str2)

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String

    val str4 = str!!.toUpperCase()

//    printText(returnNullableString()!!)
    returnNullableString()?.let { printText(it) }
    println(nullStr == str)

    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[1]?.let { println(it.toUpperCase()) }
}

fun printText(text: String){
    println(text)
}

fun returnNullableString() : String? {
//    return "This is not null"
    return null
}

class BankBranch(val address: Address?) {}
class Address(val country: Country?) {}
class Country(val countryCode: String?) {}
