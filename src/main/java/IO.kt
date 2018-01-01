import java.io.File
import java.io.FileReader
import java.io.FileWriter


fun main(args: Array<String>) {


    var quit = false
    do {
        println("Please add a name for the task or press x and Enter to exit")
        println("Press r to read the tasks")
        var task = readLine().toString()

        if(task.equals("r")){
            readMyTask()
        }
        else if(task.equals("x")){
            quit = true
        }else if(task.equals("")){
            println("Please you need to set the name of the task")
        }else{
            writeMyTask(task)
        }

    }while (!quit)

}

fun writeMyTask(task: String){

    try {
        var addingTask = FileWriter("myTasks", true)
        addingTask.write(task + "\n")
        addingTask.close()
    }catch (error: Exception){
        println("Error: $error" )
    }


}

fun treeDirectory(){

    //show tree directory
    File(".").walkTopDown().forEach { println(it)}

}

fun filteringSearch(){
    //applying filtering to get all .exe files
    File(".").walkTopDown()
            .filter { it.name.endsWith(".exe") }
            .forEach { println(it)}

}



fun readMyTask(){
    try {
        var readingTask = FileReader("myTasks")

        var char: Int?
        do {

            char = readingTask.read()
            print(char.toChar())


        }while (char != -1)




    }catch (error: Exception){
        println("Error: $error")
    }
}
