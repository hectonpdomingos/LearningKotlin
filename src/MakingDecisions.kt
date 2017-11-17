fun main(args: Array<String>) {

    var numberOne = 10
    var numberTwo = 20

    println("Returning booleans")

    println(numberOne > numberTwo)

    println(numberOne < numberTwo)

    println(numberOne == numberTwo)

    println(numberOne != numberTwo)


    if (numberOne > numberTwo){
        println("numberOne is bigger than numberTwo")
    }else{
        println("numberOne is not bigger than numberTwo")
    }

   println("simplify the if else")

    if (numberOne > numberTwo) println("Yes is bigger") else println("No isn't")

    println("If else in the common way")

    var myChar = 'h'

    if (myChar == 'u'){
        println("My char is u")
    }else if (myChar == 'i'){
        println("My char is i")
    }else {
        println("The char is $myChar")
    }


println("Logical operators  AND = && - OR = || - NOT = !     ")

 var numberThird = 90

    //&& = AND
if ((numberOne > numberTwo) && (numberThird < numberOne)){
    println("Yes")
}else {
    println("No")
}



    
}