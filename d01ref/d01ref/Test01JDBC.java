package d01ref;
import java.sql.*;
public class Test01JDBC {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									// Loading JDBC Driver
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);			// Getting Connection
		System.out.println("Successful......");
		
		conn.close();

	}

}
