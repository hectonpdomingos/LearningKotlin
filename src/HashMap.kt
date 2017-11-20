fun main(args: Array<String>) {


    var myFirstHashMap = HashMap<String, String>()
    myFirstHashMap.put("Car", "Ferrari")
    myFirstHashMap.put("Motorcycle", "CG TITAM")
    myFirstHashMap.put("Airplane", "747")


    //Output the value based on the key
    println(myFirstHashMap.get("Airplane"))

   //Outputting the key and the value
    for (item in myFirstHashMap){
        println(item.key)
    }
    //
    for (item in myFirstHashMap){
        println(item)
    }



}