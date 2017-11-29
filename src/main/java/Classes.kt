import java.sql.Connection

// The class company has the name, founded and numberEmployees parameters/proprieties
class company(name: String, founded: Int, numberEmployees: Double){


    //proprieties
    var name: String? = null
    var founded: Int? = null
    var numberEmployees: Double? = null


    init { //create a initializer to proprieties
        // this means THIS context ...the same could be company.name - company.founded
        this.name = name
        this.founded = founded
        this.numberEmployees = numberEmployees
    }

    //Equivalence Get of Java

    fun GetName(): String? {
        return this.name
    }
    //Equivalence Set of Java
    fun SetName(name: String) {
        this.name = name
    }


}




fun main(args: Array<String>) {



    //create a object "signUpCompany"
    var signUpCompany = company("Hecton Support", 2002, 2.999)
    println("Company :" + signUpCompany.name + " | Year of foundation: " + signUpCompany.founded + " | Number of employees: " + signUpCompany.numberEmployees)

    //if you want to set up the propriety here, just do it
    signUpCompany.name = "Hecton Corporation"
    //Showing the changes
    println("Company :" + signUpCompany.name + " | Year of foundation: " + signUpCompany.founded + " | Number of employees: " + signUpCompany.numberEmployees)

    //you can create as many objects as you want
    var signUpCompany2 = company("Helena Support", 2014, 10.000)
    println("Company :" + signUpCompany2.name + " | Year of foundation: " + signUpCompany2.founded + " | Number of employees: " + signUpCompany2.numberEmployees)


    //Using the equivalence Get from Java
    println("Using the equivalence Get from Java")
    println(signUpCompany.GetName())
    //Using the equivalence Set from Java
    println("Using the equivalence Set from Java - set Dimitri Corp in Name ")
    signUpCompany.SetName("Dimitri Corp")
    println(signUpCompany.GetName())


    //custom classes
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)

}


//custom classes
class Rectangle(val height: Int, val width: Int)
{ val isSquare: Boolean
    get() { return height == width }
}


//If you don't want to have your constructor accessed
// directly, you should mark it private, protected, or
// internal

class Database internal constructor(connection: Connection) {


}
