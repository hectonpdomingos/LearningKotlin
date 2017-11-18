fun main(args: Array<String>) {
    println("First Example")


    var sum: Int =  add(2, 2)
    println("result of the first function is $sum")
    println("Another way to print the return " + add(2, 2))




    println("Second example")
    add2(5, 5)

    println("Third example")
    form("Hecton", 31, 5.599)
}

//with return
fun add(num1: Int, num2: Int): Int{
    var sum = num1 + num2
    return sum
}

//void func without return
fun add2(num1: Int, num2: Int){
    var sum = num1 + num2
    println("Result of the second function is $sum")
}

//void func passing different type of data
fun form(name: String, age: Int, salary: Double){
    println("The employee is $name and he/is $age and has the salary $salary")
}