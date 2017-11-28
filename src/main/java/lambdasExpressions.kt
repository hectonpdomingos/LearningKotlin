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



println("Without with function")
println(firstCountTo100())
println("With function")
println(secondCountTo100())
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


/*
Function Scope. In Kotlin functions can be declared at top level in a file,
meaning you do not need to create a class to hold a function, like languages
such as Java, C# or Scala. In addition to top level functions, Kotlin
functions can also be declared local, as member functions and extension
functions.
 */

fun topLevelFunction() = println("Top level function")



//without (With function)
fun firstCountTo100(): String{
    val numbers = StringBuilder()
    for(i in 1..99){
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()

}

//With  function - Inside the with function you dont need to refer the obj
fun secondCountTo100(): String{
    val numbers = StringBuilder()
    return with (numbers) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

//using  expression body
fun thirdCountTo100() =
    with(StringBuilder()){
            for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
}


//using apply function - Calls the specified function block with this value
// as its receiver and returns this value.

fun applyCountTo100() =
        StringBuilder().apply(){
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()





//Normal function
fun sum0(x: Double, y:Double): Double{
    return x + y
}

//Using lambda
val sum1 = {x: Double, y: Double -> x + y}
val sum2:(Double, Double) -> Double = {x , y -> x + y}

fun soma(args: Array<String>){
    println("Sum0 = ${sum0(10.1, 11.2)}")

    println("Sum1 = ${sum1(10.1, 11.2)}")

    println("Sum2 ${sum2(10.1, 11.2)} ")
}