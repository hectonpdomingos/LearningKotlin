fun filters(lang: String){

    var lang: String? = null


    val languages = listOf("Portuguese", "English", "Spanish")
    println(languages.filter { it.equals(lang)})


}

fun evenNumbers(){
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
     println(numbers.filter { it % 2 == 0 })
}
data class TheEmployee(val name: String, val age: Int)
fun company() {


    val employee = listOf(TheEmployee("Hecton", 32), TheEmployee("Dimitri", 2))
    var result = employee.filter { it.age == 2 }
    print(result)


}


var family: List<String> = listOf("Dimitri", "Liza", "Igor", "Elena", "Hecton")


fun main(args: Array<String>) {


    println("filtering only one string")
    println(family.filter { it == "Hecton" })
    println("filtering - getting all except one")
    println(family.filter { it != "Hecton" })

    println("__")
   filters("Spanish")


    println("Calling a function thats find even numbers ")
    evenNumbers()


    println("Calling a function thats find a employee")
    company()


}
