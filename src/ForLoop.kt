fun main(args: Array<String>) {

    //dynamically range
    var limit = 10
    for(count in 0..limit){
        println(count)
    }

    // Static range
    for (count in 0..10){
        println(count)
    }

    println("Type a limit for the loop")
    var theLimit = readLine()!!.toInt()

    for (myCount in 0..theLimit){
        println("The Limit is $theLimit and we are in the count of $myCount")
    }

}