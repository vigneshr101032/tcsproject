package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabseUtil {
  private static Connection con=null;
  public static Connection getConnection()
  {
	  
		  try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@intvmoradb04:1521:ORAJAVADB", "TVM1617_TVM39_TJA243_DEV", "tcstvm");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  return con;
	  
  }
  public static void closeConnection()
  {
	  if(con!=null)
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
