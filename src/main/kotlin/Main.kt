import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement

fun main() {

    val url = "jdbc:postgresql://localhost/db?user=postgres&password=sanjeev"
    val conn: Connection = DriverManager.getConnection(url)

    val addLogStatement: PreparedStatement = conn.prepareStatement("INSERT INTO prices (price) VALUES (?)")
    addLogStatement.setInt(1, 100)
    addLogStatement.executeUpdate()
    addLogStatement.close()
    println("Done")

//    val sellOrderService: SellOrderService = SellOrderService(conn)
//
//    for(i in 0..100)
//
//        val newPrice= Random.nextInt(70,100)
//        sellOrderService.executeSell(newPrice)
//    }
}