fun main(args: Array<String>) {
    /*
    Ways to manipulate string type
     */

    var firstName:String = "Hecton"
    var nationality:String = "Brasilian"

    // If you  want to chaneg the firstName

    firstName = "Hecton Domingos"

    //If you want turn firstName immutable use val
    val myFirstName:String = "Hecton"

    //If you don not want to set the values in the declaration
    //use ? = null

    var myFirstName2:String? = null

    println("My first name is $firstName")
    println("My nationality is $nationality")
    println("The var myFirstName $myFirstName is immutable")
    println("The var myFirstName2 is $myFirstName2")



}