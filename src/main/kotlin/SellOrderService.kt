import java.sql.Connection
import java.sql.PreparedStatement

class SellOrderService(private val conn: Connection){

    fun executeSell(price:Int,maxPrice: Int = 100)
    {
        val addLogStatement: PreparedStatement = conn.prepareStatement("INSERT INTO sellPrices (price, timeStamp) VALUES (?)")
        addLogStatement.setObject(1, price)
        addLogStatement.executeUpdate()
        addLogStatement.close()

        val updatePriceStatement: PreparedStatement = conn.prepareStatement("UPDATE sellPrice (price) VALUES (?)")
        updatePriceStatement.setObject(1, price)
        updatePriceStatement.executeUpdate()
        updatePriceStatement.close()
    }
}