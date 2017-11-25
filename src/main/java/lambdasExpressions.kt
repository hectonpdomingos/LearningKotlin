fun main(args: Array<String>) {
    run {println("First lambda expression")}

    //creating a list and store some ata
    val employees = listOf(Employee("Hecton", "Domingos", 2000),
            Employee("Dimitri", "Domingos", 2014),
            Employee("Elena", "Lezhneva", 2000))


//println(employees.minBy { e -> e.startYear })

//using member reference
   println(employees.minBy (Employee:: startYear ))


// second way to express this lambda
    // println(employees.minBy { it.startYear })

//if you want to specify the type
    //println(employees.minBy { e: Employee -> e.startYear })


//using run
    var num = 20
    run {
        num += 15
        println(num)
    }


    //calling top level functions
    run(::topLevelFunction)


}

//if return a reference with (class Employee), just add "data" in the beginning
data class Employee(val firstName: String, val lastName: String, val startYear: Int){

}



//in the fun the num is val
fun useParam(employee: List<Employee>, num: Int)
{
    employee.forEach {
        println(it.firstName)
        println(num)

    }
}

fun topLevelFunction() = println("Top level function")