fun main(args: Array<String>) {



    var sair: Boolean = false


    do {
        println("###############################")
        println("###### Choose one of the option ")
        println("1: Clients")
        println("2: Products")
        println("3: Exit")
        var pt: Int? = readLine()!!.toInt()
        when(pt){
            1 ->{

                println("###############################")
                println("### Clients Controller ########### ")

        }
            2 ->{
                println("###############################")
                println("### Product Controller ########### ")

        }
            3  ->{
             sair = true
        }

        }

    }

    while (sair == false)



}