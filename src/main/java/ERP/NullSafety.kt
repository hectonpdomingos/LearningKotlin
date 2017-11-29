package ERP

class Person constructor(val firstName: String, val lastName:  String, val age: Int?) {}


fun main(args: Array<String>) {
    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith", null)

    println("${person1.firstName},${person1.lastName} is  ${person1.age} years old")
    //using elvis operator
    println("${person2.firstName},${person2.lastName} is ${person2.age?.toString() ?: "?"} years old")    }