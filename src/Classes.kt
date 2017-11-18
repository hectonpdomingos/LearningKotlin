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

}

fun main(args: Array<String>) {

    //create a object "signUpCompany"
    var signUpCompany = company("Hecton Support", 2002, 2.999)
    //you can create as many objects as you want
    var signUpCompany2 = company("Helena Support", 2014, 10.000)

    println("Company :" + signUpCompany.name + " | Year of foundation: " + signUpCompany.founded + " | Number of employees: " + signUpCompany.numberEmployees)
    println("Company :" + signUpCompany2.name + " | Year of foundation: " + signUpCompany2.founded + " | Number of employees: " + signUpCompany2.numberEmployees)
}