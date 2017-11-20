fun main(args: Array<String>) {



    //Setting  keys and values
    var myFirstHashMap = HashMap<String, String>()
    myFirstHashMap.put("Car", "Ferrari")
    myFirstHashMap.put("Motorcycle", "CG TITAM")
    myFirstHashMap.put("Airplane", "747")
    myFirstHashMap.put("Country", "Brazil")
    myFirstHashMap.put("Language", "Portuguese")
    myFirstHashMap.put("Food", "Pizza")

    //Replacing values
    myFirstHashMap.replace("Country", "Brazil", "Russia")

    //Removing values
    myFirstHashMap.remove("Food")


    println("#### Checking if the key exists")
    if (myFirstHashMap.containsKey("Language")){
        println("The key exist")
    }else{
        println("The key does not exist")
    }

    println("##### Output the value based on the key")
    println(myFirstHashMap.get("Airplane"))

    println("##### Outputting the key and the value")
    for (item in myFirstHashMap){
        println(item)
    }
    println("##### Outputting only the key")
    for (item in myFirstHashMap){
        println(item.key)
    }
    println("##### Outputting only the value")
    for (item in myFirstHashMap){
        println(item.value)
    }
    println("##### Second way to outputting the values from HashMap")

    for (k in myFirstHashMap.keys){
        println(myFirstHashMap.get(k))
    }



    //Clear all keys and values
    myFirstHashMap.clear()

    println("### HashMap with Any allow us to insert any type of data")
    var mySecondHashMap = HashMap<Any, Any>()
    mySecondHashMap.put(1, "One")
    mySecondHashMap.put(2, 2)
    mySecondHashMap.put("3", 3)
    mySecondHashMap.put("Four", "Four")

    for(item in mySecondHashMap){
        println(item)
    }

}