package Controller;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;;

public class Cnnect {
	//connect tới SQLServer
	public Connection getCNN() {
		Connection conn= null;
		 String dbURL = "jdbc:sqlserver://localhost:1433;database=QLKP";
	     String user = "sa";
	     String pass = "DatabaseMy123";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection(dbURL,user,pass);
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
