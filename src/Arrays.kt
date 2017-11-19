

fun main(args: Array<String>) {

    //Array with 5 blocks filled with the number 8
    var myFirstArray = Array<Int>(5) {8}

    //Arrays Filled with static numbers
    val values = arrayOf(1, 2, 3, 4, "Brazil", 'H')
    for (index in values) {
        println(index)
    }



    println("Add values in the indexes")
    var count = 0
    var emptyArray = arrayOfNulls<Int>(10)
    for (item in 0..emptyArray.size){
       //if (count <= emptyArray.size){
           //emptyArray[count] = 2
        emptyArray[count] = count

        println("Value in the count" + count)
        println("Value in the array " + emptyArray[count])
        ++count

       // }

    }

    //Showing the values in the array
    for (item in emptyArray){
        println(emptyArray[count])
        ++count
    }





  //  var mySecondArray = Array<String>(0, {i -> ""})





    }


