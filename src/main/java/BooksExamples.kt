//find the oldest person

data class Person(val name: String, val age: Int? = null)
fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", age = 90), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}
