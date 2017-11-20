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

    //Clear all keys and values
    myFirstHashMap.clear()


}