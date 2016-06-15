import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

	String driver = "org.sqlite.JDBC"
	Class.forName(driver);
	String dbName = "orders.db"
	String dbUrl = "jdbc:sqlite:" + dbName
	Connection conn = DriverManager.getConnection(dbUrl)

  Statement st = conn.createStatement()
  
  ResultSet rs = null
  
  def keepGoing = true
  
  String query = """
                    select a.id from
                      orders a
                        inner join
                      orderItems b
                        on a.id = b.orderId
                        inner join 
                      items c
                        on b.itemid = c.id
                      where c.name LIKE '%JAZZY%'
                  """
   	rs = st.executeQuery(query)
   	while(keepGoing) {
      if (!rs.next() ){
   		   keepGoing = false
   	  } else {
    	
    	   Integer id = rs.getInt(1)
    	   println "Order ID:" + id
      }

    } 
	   	

	
