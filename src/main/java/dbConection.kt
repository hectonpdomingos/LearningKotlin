import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet




class DBConnection {
    var username = "root"
    var password = "12domlei"
    var host = "127.0.0.1"
    var db = "tasks_db"
    var strConnessione: String = "jdbc:mysql://" + this.host + ":3306/" + this.db + "?user=" +
    this.username + "&password=" + this.password + "&noAccessToProcedureBodies=true"
    var theClassName = "com.mysql.cj.jdbc.Driver"

      


    fun addData(addDataInto: String){
        Class.forName(theClassName)
        var conn: Connection = DriverManager.getConnection(strConnessione)
        var ps: PreparedStatement = conn.prepareStatement(addDataInto)
        ps.execute()


    }
    fun listAllTasks(){

        var listAllTasks = "SELECT * FROM task"
        Class.forName(theClassName)
        var conn: Connection = DriverManager.getConnection(strConnessione)
        var ps: PreparedStatement = conn.prepareStatement(listAllTasks)
        var rs: ResultSet = ps.executeQuery()
        while (rs.next()) {

            println("(ID): " + rs.getString("id") + " (Task): "+ rs.getString("mytask") + " (Date): " + rs.getString("datatask"))
        }

      }

    fun  delTask(deleteTask: String){
        Class.forName(theClassName)
        var conn: Connection = DriverManager.getConnection(strConnessione)
        var psDelete: PreparedStatement = conn.prepareStatement(deleteTask)
        psDelete.execute()

    }

    fun updateTask(updateTask: String){
        Class.forName(theClassName)
        var conn: Connection = DriverManager.getConnection(strConnessione)
        var psDelete: PreparedStatement = conn.prepareStatement(updateTask)
        psDelete.execute()
    }
}


fun main(args: Array<String>) {
    var exit = false
    do {
        println("######## Choose one of the options #########")
        println("1 - List the tasks")
        println("2 - add a task")
        println("3 - delete a task")
        println("4 - update a task")
        println("5 - Exit")
        println("#############################################")
        var option = readLine()!!.toInt()

        when(option){
            1 -> {
                var db = DBConnection()
                db.listAllTasks()
                println("")
                println("")


            }

            2 ->{

                println("Type the subject of the task. Ex: Interview at Microsoft")
                var subject = readLine().toString()
                println("Type the date when it will happen on this format: 04/01/2018")
                var taskDate = readLine().toString()
                var query = "INSERT INTO `" +
                        "task` (`mytask`, `datatask`) VALUES ('"+ subject + "', '" +
                        taskDate + "')"
                var adddb = DBConnection()
                adddb.addData(query)


            }

            3 ->{
                println("Choose the ID that is corresponding to the task you want DELETE ")
                var deltask = DBConnection()
                deltask.listAllTasks()
                println("Type the CORRECT  ID:")
                var correctId = readLine()!!.toInt()
                var delQuery = "DELETE FROM task WHERE id='" + correctId + "'"
                deltask.delTask(delQuery)

            }

            4 ->{
                println("Type the ID that you want UPDATE")
                var listUpdatedb = DBConnection()
                listUpdatedb.listAllTasks()
                println("Type the ID: ")
                var theID = readLine()!!.toInt()
                println("Type the FIELD you want UPDATE")
                println("1 - Subject")
                println("2 - Date")
                println("Type the FIELD")
                var field = readLine()!!.toInt()

                if (field == 1){
                    println("Update the Subject")
                     var newSubject = readLine()!!.toString()
                    var updateQuery = "UPDATE task set mytask='" + newSubject + "' WHERE id='"+ theID + "'"
                    var updateMyTask = DBConnection()
                    updateMyTask.updateTask(updateQuery)

                }else if (field == 2){
                    println("Update the Subject")
                    var newDataTask = readLine()!!.toString()
                    var updateQuery = "UPDATE task set datatask='" + newDataTask + "' WHERE id='"+ theID + "'"
                    var updateMyTask = DBConnection()
                    updateMyTask.updateTask(updateQuery)

                }else {
                    println("")
                    println("############You have just TWO options - 1 and 2 - start again ###################")
                    println("")
                }

            }

            5 ->{
                exit = true
            println("Bye!")
            }

        } //the end of WHEN

    } while (!exit)

}


