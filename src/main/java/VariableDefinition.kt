fun main(args: Array<String>) {
    /*
    Variables are "places" where you can save your voodoo
    LOL

    var {mutable}
    val { A local val is immutable} val is short for value.
     */
     var firstName = "Hecton" //you can change it later
     val fullName = "Hecton Domingos" // you cannot change it later
     var age = 31

    //there is two ways to concatenates a string
    println("You can concatenate using the kotlin way $firstName")
    println("You also can concatenate like that " + fullName)



    println("My name is $firstName")
    println ("My name is $fullName" + "and I am " + age + "years old")



}