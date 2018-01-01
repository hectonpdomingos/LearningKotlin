//to define default value if it is null use elvis operator ?:

fun main(args: Array<String>) {



    //Will print the Dima name.
    var srt: String? = "Dima"
    var name =  srt?: "Hecton"

    println("MY name is $name")

    //Now, if the srt is null, will print the second value

    var myName: String? = null
    var defaulName =  myName?: "Hecton"

    println("MY name is $defaulName")


}