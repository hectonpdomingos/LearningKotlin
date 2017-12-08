import java.util.*

fun main(args: Array<String>) {

    println()
    var x = 0
    for (item in 10.rangeTo(20).step(2)){
        print("${++x}) ${item}, " )
    }
    println()

    for ((index, item) in 10.rangeTo(20).step(2).withIndex()){
        print("${index + 1}) $item, ")
    }



    println()

    val myIntRange = 1..10
    val myLetterRange = 1..10


    for(item in myIntRange){
        println(item)
    }

    println()
}