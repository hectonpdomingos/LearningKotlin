
//Every class in Kotlin is Final, so to allows the inheritance
// needs to set as open
open class Animal() // () primary constructor
    {

    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    //secondary constructor
    constructor(name: String, color: String, numLegs: Int) : this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs

        //Show the Object
        println("Name: " + this.name)
        println("Color: " + this.color)
        println("Legs: " + this.numLegs)

    }
        //Overloading the constructor
    constructor(name: String, color: String): this(){
        this.name = name
        this.color = color
        println("Third constructor" + this.name)


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

    println("Name: " + lion.name )
    println("Color" + lion.color)
    println("Legs" + lion.numLegs)


    println("Lion name and color propriety from constructor overloaded ")
    var newLion = Animal("King Leon", "Light Yellow")

    println("Name: " + newLion.name + "| Color: " + newLion.color)

}