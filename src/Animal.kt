
//Every class in Kotlin is Final, so to allows the inheritance
// needs to set as open
open class Animal() // () primary constructor
    {
        //private propriety
        private var myVar: String? = null
        var name: String? = null
        var color: String? = null
        var numLegs: Int? = null

        //secondary constructor
        constructor(name: String, color: String, numLegs: Int) : this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs

        //Show the Object auto when instantiated
//            println("Name: " + this.name)
//            println("Color: " + this.color)
//            println("Legs: " + this.numLegs)


    }

        //Overloading the constructor
    constructor(name: String, color: String): this(){
        this.name = name
        this.color = color
       // println("Third constructor" + this.name)
    }



        //setter of myVar propriety
        fun setMyVar(myVar: String){
            this.myVar = myVar

        }
        fun getMyVar(): String? {
            return this.myVar

        }


        // fun to show the value of the object in the moment
        fun showAnimal(){
            println("Name is: " + this.name)
            println("Color is: " + this.color)
            println("Num legs: " + this.numLegs)
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
    animal.showAnimal()

    println("")
    println("")
    println("Lion proprieties")
    var lion = Lion()
    lion.name = "Cimbar"
    lion.color = "yellow"
    lion.numLegs = 4

    println("Name: " + lion.name)
    println("Color: " + lion.color)
    println("Legs: " +  lion.numLegs)

    println("")
    println("")
    println("Lion name and color propriety from constructor overloaded ")
    var newLion = Animal("King Leon", "Light Yellow")

    println("Name: " + newLion.name + "| Color: " + newLion.color)

   //Show the showAnimal fun
    println("")
    println("")
    println("Show the Duck object")
    var n = Animal("Duck", "White")
    n.showAnimal()



 //Passing and getting values to and from private vars/proprieties 

    println("My first private value passed")
    var myPrivateVar  = Animal()
    myPrivateVar.setMyVar("First value passed")
    println(myPrivateVar.getMyVar())
    println("My second private value passed")
    myPrivateVar.setMyVar("Second value passed")
   println(myPrivateVar.getMyVar())




}