//main funcion
fun main (args: Array<String>){


    //instantiate the class
    val theAnimal = Animals()


    //instantiate car
    val myCar = Car("Pick Up")


}


//class
class Animals{

}


// class with primary constructor
class Car constructor(model: String){

    var model: String = model


}


//class airplane with primary constructor and Init
class Airplane constructor(model: String){


    val model: String


    //init block

    init{
        this.model = model
    }

}


//class with property declaration in the primary constructor
class Company constructor(val name: String){
//use val before the name of variable

}


// class with protected constructor
class Employees protected constructor(val name: String){

}














