
fun main(args: Array<String>) {

    println("Type a option 1 to 3")
    var x = readLine()!!.toInt()

    when(x){

        1 ->{
            println("One")
        }
        2 -> {
            println("Two")
        }
        3 ->{
            println("Three")
        }

        in 4..7 ->{
            println("Between 4 and 7")
        }
    }

    when {
        x <= 0 -> println("Less or equals 0")
        x % 2 == 1 ->   println("The number typed is Odd")
        x % 2 == 0 ->   println("The number typed is even")
    }



}