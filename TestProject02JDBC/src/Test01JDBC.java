import java.sql.*;

public class Test01JDBC {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									// Loading JDBC Driver
		// jdbc:mysql - protocol for URL
		// 		jdbc   - Major Protcol
		// 		mysql  - Minor Protocol
		// localhost - machine address
		// 3306 - default MySQL port number
		// test - data base in MySQL Server
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);			// Getting Connection
		System.out.println("Successful......");
		
		conn.close();
	}
}
