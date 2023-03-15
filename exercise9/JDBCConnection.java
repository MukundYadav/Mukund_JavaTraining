package exercise9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private JDBCConnection() {
		
	}
	
	public static Connection getConnection() {
	
		/* Driver for MySQL */
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/* Connection for MySQL */
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/e9","root","Muku18##");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
