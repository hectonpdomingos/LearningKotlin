
fun main(args: Array<String>) {

    //Array with 5 blocks filled with the number 8
    var myFirstArray = Array<Int>(5) {8}

    println("################  Arrays Filled with static numbers  #####################")
    val values = arrayOf(1, 2, 3, 4, "Brazil", 'H', "Dimitri")
    for (index in values) {
        println(index)
    }

    println("################   Add values in the indexes ################")
    var count = 0
    var fillThisArray = arrayOfNulls<Int>(10)
    var emptyArray = arrayOfNulls<Int>(10)
    for (item in emptyArray){
        emptyArray[count] = count
        fillThisArray[count] = count
        println("Added in the index: " + count + " the value of: " + emptyArray[count])
        if (count <  9){
            ++count
        }

    }
    println("End of FIRST Loop")

    println("################  Showing the values in the fillThisArray  array ##################")
    var count2 = 0
    for (item2 in fillThisArray){
        println(fillThisArray[count2])
        if (count2 < fillThisArray.size){
            ++count2

        }

    }
    println("End of SECOND Loop")


}



