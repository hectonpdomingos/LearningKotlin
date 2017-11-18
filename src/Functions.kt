fun main(args: Array<String>) {
    println("Function example")


    var sum: Int =  add(2, 2)


    println("result of the first function is $sum")

    println("Second way to do function")

    add2(5, 5)
}

//with return
fun add(num1: Int, num2: Int): Int{
    var sum = num1 + num2
    return sum
}

//without return
fun add2(num1: Int, num2: Int){
    var sum = num1 + num2
    println("Result of the second function is $sum")
}