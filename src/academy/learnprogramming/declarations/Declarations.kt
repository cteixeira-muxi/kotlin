package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main() {
//    val employeeOne = Employee("Mary", 1)
//    val employeeTwo = Employee("John", 2)
//    val employeeThree = Employee("John", 2)
//    val employeeFour = employeeTwo
//
//    println(employeeOne == employeeTwo)
//    println(employeeOne === employeeTwo)
//    println(employeeTwo == employeeThree)
//    println(employeeTwo === employeeThree)
//    println(employeeTwo == employeeFour)
//    println(employeeTwo === employeeFour)
//
//    val x = 0x00101101
//    val y = 0x11010010
//
//    val something : Any = employeeFour
//    if(something is Employee) {
//        println("Something name = ${something.name}")
//        val newEmployee = something as Employee
//        println("NewEmployee name = ${newEmployee.name}")
//    }
//
//    var number : Int
//    number = 10
//    number = 20
//
//    val names = arrayListOf("John", "Jane", "Mary")
//    names.forEach { println(it) }
//
//    val employees : EmployeeSet
//
    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    println(employee1)
//
//    val employee2 : Employee
//    val number2 = 100
//
//    employee2 =
//        if(number < number2) {
//            Employee("Jane Smith", 400)
//        }
//        else {
//            Employee("Mike Watson", 150)
//        }
    val change = 4.22
    println("To show the value of change, we use \$change")
    println("Your change is $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The employee's id is ${employee1.id}")

    val filePath = """c\somedir\somedir2"""

    val eggName = "Humpty"
    val nurseryRhyme = """$eggName Dumpty sat on the wall
                         |$eggName Dumpty had a great fall
                         |All the king's horses and all the king's men
                         |Couldn't put $eggName together again.""".trimMargin()
    println(nurseryRhyme)
}

class Employee(var name: String, val id : Int) {

    override fun equals(other: Any?): Boolean {
        if(other is Employee)
            return name == other.name && id == other.id
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}
