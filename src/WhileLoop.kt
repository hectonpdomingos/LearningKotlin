fun main(args: Array<String>) {

    var counter = 0

    //Do While Loop

    do{
        println("Counting ... $counter")
        counter++
    }while(counter < 5)

    println("The end of the Do While Loop")
    // While loop

    var counter2 = 0
    while (counter2 < 5){
        println("Counting ... $counter2")
        counter2++
    }
    println("The end of the While Loop")


    println("Do while example")

    var isTrue: Boolean? = false


    do {
        println("Guess a number")
        var answer: Int? = readLine()!!.toInt()
        when(answer) {
            12 -> {

                isTrue = true
                println("Correct!")

            }else -> {
            println("Wrong!")
        }
        }

    }while (isTrue == false)
}



