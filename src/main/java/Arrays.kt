

fun main(args: Array<String>) {



    println("Outputting a simple array")
    var simpleArray = arrayOf(0,1,2,3,4)
    println("This array has ${simpleArray.size} indexes")
    //if you try 0..simpleArray.size will generate a exception, bc the for loop counts 0 + array.size
    for(index in 0..4 ){
        println(simpleArray[index])
    }

    println("Another Simple Array")

    var anotherSimpleArray = arrayOf("Apple", "Dimitri", 2014, "Kaka", "Mama", "Hecton")
    var deallingWithPositions = anotherSimpleArray[2]
    for (position in anotherSimpleArray){
        //generates error
        // println(anotherSimpleArray[position as Int])

        //will be fine
        println(position)
        //find the value
        if (position.equals("Dimitri")){
            println("I found the boy")
        }
        if (position.equals(deallingWithPositions)){
            println(" ------------We found the index (2) ${position}")
        }
    }

    println("#############   Playing with arrayListOf ############")
   var food = arrayListOf("Banana", "Apple", "Watermelon", "Orange")
   println(food.size)
    println("Adding Pasta on arrayListOf")
   food.add("Pasta")
    println("Adding Meat on index 0")
   food.add(0, "Meat")
    println("Showing the indexof banana")
   println(food.indexOf("Banana"))
    println("Removing the apple from Array ")
    food.remove("Apple")


    println("############## Playing with mapOf ###########")

    var languages = mapOf("pt-br" to "Brazil", "En" to "USA", "Es" to "Spain")
    println(languages["En"])
    println(languages.get("pt-br"))
    println(languages.getOrDefault("Es", "This language does not exist on this array"))



    println("################   Array with 5 blocks filled with the number 8")
    var myFirstArray = Array<Int>(5) {8}
    for (item in myFirstArray){
        println(item)
    }


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

    println("Using lambda expression of integers of a size of N initialized with a default value of 2")
    var N = 10
    var myIntArrayCount = 0
    val myIntArray = IntArray(N, {i -> 2})
    for (item in myIntArray){
        println("Value:" + myIntArray[myIntArrayCount])
        ++myIntArrayCount
    }
    println("End of THIRD Loop")


println("Output the result 0, 1,2,3 - X index")
    var X = 10
    var countSoOn = 0
    var arraySoOn = Array<String>(X, { "$it" } )
    for (item in arraySoOn){
        println(arraySoOn[countSoOn])
        ++countSoOn
    }


    println("Creating a array with 20 and fill it with even numbers")
    val evenNumbers = Array(20){ i -> i * 2}
    for (n in evenNumbers){
        println(n)
    }

    println("Fill with + 1 * 10")
    var arrayFilled = Array(6){i ->(i + 1 ) * 10}
    for (item in arrayFilled){
        println(item)
    }

    println("########### Working with ArrayLists #############")
    var myFirstArrayList = ArrayList<String>()
    //Adding informaiton
    myFirstArrayList.add("One")
    myFirstArrayList.add("Two")
    myFirstArrayList.add("Three")
    myFirstArrayList.add("Four")
    // Setting in a specific index
    myFirstArrayList.add(4, "LOVE")
    myFirstArrayList.add(5, "WILL BE REPLACED")

    //Using set option to REPLACE a value
    myFirstArrayList.set(5, "WILL BE REPLACED")
    // for some fucking reason, you can do shit like that
    // myFirstArrayList.add(99, "Value")  if there is no 98 index

    //removing information
    myFirstArrayList.remove("Three")

    for(showMyArrayList in myFirstArrayList){
        println(showMyArrayList)
    }


    println("############# array listOf  ########")
    var members = listOf("Hecton", "Dimitri", "Igor", "Helena", "Liza")
    println("Showing the normal order")
    println(members)
    println("Showing the list sorted")
    println(members.sorted())
    println(members.last())


    var doubles = doubleArrayOf(1.1,1.2,1.3,1.4,1.5)
    //manipulating arrays
    doubles.forEach { eachNumber -> println(eachNumber) }


    println("Array with range")
    var myArrayRange = arrayOf(10,20,30,40,50,60)
    for (item in myArrayRange.indices){
        println("index of ${item} in the array ${myArrayRange[item]}")
    }

    println()


    println("Array with long elements")
   var arrayLong = arrayOf(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L,10L)
    for (item in arrayLong){
        print(" $item " )
    }
    println()
println("Another ArrayOf type long")
    var arrayLong2 = arrayOf<Long>(1,2,3,4,5,6,7,8,9,10)
    for (item in arrayLong2){

        print("  $item  ")
    }





}

