
/*
Mockup ERP developed in Kotlin - Hecton P. Domingos


 */


var storeData = ArrayList<String>()


open class AddPersonData(name: String, birth: String, address: String, phone: String){
    var name: String? = null
    var birth: String? = null
    var address: String? = null
    var phone: String? = null

    init{
        this.name = name
        this.birth = birth
        this.address = address
        this.phone = phone

        storeData.add(name)
        storeData.add(birth)
        storeData.add(address)
        storeData.add(phone)
        storeData.add("|")

    }



}








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
                var clientControl = false
                do {
                    println("###############################")
                    println("### Clients Controller ########### ")
                    println()
                    println("1: List")
                    println("2: Add")
                    println("3: Remove")
                    println("4: Change")
                    println("5: Back to main menu")
                    var clientControlMenu = readLine()!!.toInt()
                    if (clientControlMenu != 1  || clientControlMenu != 2 || clientControlMenu != 3 || clientControlMenu != 4 || clientControlMenu != 5){
                        println("######### select the right ########### ")

                    }else if(clientControlMenu.equals(5)){
                        clientControl = true
                    }


               //option
                when(clientControlMenu){
                    1 -> {

                        println("################## List of Clients  #################")
                        println(" ")

                        for(item in storeData) {
                            print("  " + item + "  ")
                            if(item.equals("|")){
                                println("")
                            }
                        }

                        println("")
                        println("#######################################################")


                    }


                    2->{

                            println("Enter the full name")
                            var name: String = readLine().toString()
                            println("Enter the birth date")
                            var birth: String = readLine().toString()
                            println("Enter the Address")
                            var address: String = readLine().toString()
                            println("Enter the phone number")
                            var phone: String = readLine().toString()
                            AddPersonData(name, birth, address, phone)

                    }

                    3 ->{}

                    4 ->{}


                  }
                    //End Client Control
                } while (clientControl.equals(false))




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