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

    println("Company :" + signUpCompany.name + " | Year of foundation: " + signUpCompany.founded + " | Number of employees: " + signUpCompany.numberEmployees)
}