fun main(args: Array<String>) {

    /*

     */
    println("############ Adding numbers ###############")

    var firstNum = 20
    var secondNumber = 30

    var result: Int?
    result = firstNum + secondNumber

    println("The sum of first and second number is $result")

    println("If you want to make the math use { between numbers ${firstNum + secondNumber}")

    println("############ Subtraction ###############")

    println("Subtraction ${firstNum - secondNumber}")


    println("############ Multiply ###############")

    println("Multiply ${firstNum * secondNumber}")


    println("############ Division ###############")

    println("Division ${firstNum / secondNumber}")

    println("you can convert the number")
    println("Division ${firstNum.toFloat() / secondNumber.toFloat()}")


    println("############ Remainder ###############")

    firstNum = 4
    secondNumber = 2
    println("Division ${firstNum % secondNumber}")

    



}