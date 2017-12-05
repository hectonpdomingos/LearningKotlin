package ERP

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet

class DBConnection(var username: String, var password: String, var host: String, var db: String, var query: String) {
    var strConnessione: String = "jdbc:mysql://" + this.host + ":3306/" + this.db + "?user=" +
            this.username + "&password=" + this.password + "&noAccessToProcedureBodies=true"

    fun connessione() {
        Class.forName("com.mysql.cj.jdbc.Driver")
        var conn: Connection = DriverManager.getConnection(strConnessione)
        var ps: PreparedStatement = conn.prepareStatement(query)
        var rs: ResultSet = ps.executeQuery()
        while (rs.next()) {

            println("(Name): " + rs.getString("name") + " (Email): "+ rs.getString("email"))
        }
    }
    fun addData(addDataInto: String){
        Class.forName("com.mysql.cj.jdbc.Driver")
        var conn: Connection = DriverManager.getConnection(strConnessione)
        var ps: PreparedStatement = conn.prepareStatement(addDataInto)
        var rs: ResultSet = ps.executeQuery()

    }
}


fun main(args: Array<String>) {
    var db = DBConnection("root", "12domlei", "127.0.0.1", "forwarder_db", "SELECT * FROM users_tb where name='Hecton'")
    db.connessione()

}