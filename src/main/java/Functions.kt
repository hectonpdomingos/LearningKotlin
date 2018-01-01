
/*
check Destructing in kotlin....to return multiples return..
https://android.jlelse.eu/this-simple-trick-will-have-you-creating-multiple-returns-in-kotlin-37b9fe2a2f9f
 */
fun main(args: Array<String>) {
    println("First Example")


    var sum: Int =  add(2, 2)
    println("result of the first function is $sum")
    println("Another way to print the return " + add(2, 2))




    println("Second example - Unit Type")
    add2(5, 5)

    println("Third example - Unit Type")
    form("Hecton", 31, 5.599)

    println("The employee is ${form2("Hecton", 31, 6.999)}")

max(6,9)

    println("Calling the function with default values")
    staticValues()
    println("Calling the function setting values")
    var z = staticValues(500, 700, "Hecton Domingos")
    println(z)

}

//function with statement on it

fun myMood(mood: String = "happy"){
    if (mood == "happy"){
        println("Lets play a game")
    }else{
        println("It is not good")
    }
}

//function with one line
fun multiplyFunction(number: Int) = number * 10

//2 function with one line
fun multiplyFunction2(number: Int): Int = number * 10

// one line function with strings
fun helloStranger(name: String, location: String): String = "Hello to you $name at $location"


//return max number
fun max(a: Int, b: Int): Int { return if (a > b) a else b }
//second way to do it - type inference
// fun max(a: Int, b: Int) = if (a > b) a else b
/*
Note that omitting the return type is allowed only for functions with an expression body.
For functions with a block body that return a value, you have to specify the return type
and write the return statements explicitly.
 */


//with return
fun add(num1: Int, num2: Int): Int{
    var sum = num1 + num2
    return sum
}

//void func without return - Unit Type
fun add2(num1: Int, num2: Int){
    var sum = num1 + num2
    println("Result of the second function is $sum")
}

//void func passing different type of data - Unit Type
fun form(name: String, age: Int, salary: Double){
    println("The employee is $name and he/is $age and has the salary $salary")
}

fun form2(name: String, age: Int, salary: Double): String {
    return name + age + salary


}


fun staticValues(x: Int = 10, y: Int = 20, name: String = "Hecton"): Int{
 val results = x + y
 println(name)
    return results
}