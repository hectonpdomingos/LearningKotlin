package ERP

/*
Mockup ERP developed in Kotlin - Hecton P. Domingos
 */
fun main(args: Array<String>) {

    var exit = false


    do {
        println("############ Main Menu #############")
        println("")
        println("1: Costumers")
        println("2: Employees")
        println("3: Products")
        println("4: Sells")
        println("99: Exit")
        println()
        println("###################################")
        var selected = readLine()!!.toInt()

        when(selected){
            1 ->{

                println("###############################")
                println("### Clients Controller ########### ")
                println()
                println("1: List")
                println("2: Add")
                println("3: Remove")
                println("4: Change")
                println("5: Back to main menu")
                var clientControlMenu = readLine()!!.toInt()


            }
            2 ->{
                println("###############################")
                println("### Employees Controller ########### ")
                println()
                println("1: List")
                println("2: Add")
                println("3: Remove")
                println("4: Change")
                println("5: Back to main menu")
                var employeeControlMenu = readLine()!!.toInt()

            }
            3 ->{
                println("###############################")
                println("### Product Controller ########### ")


            }
            4 ->{
                println("###############################")
                println("### Sells Controller ########### ")

            }
            99  ->{
                exit = true
            }

        }


    }while (!exit)

}