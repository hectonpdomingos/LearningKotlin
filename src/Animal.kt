
//Every class in Kotlin is Final, so to allows the inheritance
// needs to set as open
open class Animal(){

    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null
    //primary constructor
    constructor(name: String, color: String, numLegs:Int): this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs

        //Show the Object
        println("Name: " + this.name)
        println("Color: " + this.color)
        println("Legs: " + this.numLegs)

    }
}

/*
Seting the concept of inheritance

The class Lion() will get (inheritance) the Animal class/proprieties
 */
class Lion(): Animal(){
}

fun main(args: Array<String>) {
    //Seting the values to the proprieties
    println("Animal proprieties")
    var animal = Animal("Dog", "Brown", 4)

    println("Lion proprieties")
    var lion = Lion()
    lion.name = "Cimbar"
    lion.color = "yellow"
    lion.numLegs = 4

    println("Name: " + lion.name)
    println("Color" + lion.color)
    println("Legs" + lion.numLegs)


}