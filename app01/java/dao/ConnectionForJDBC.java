package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionForJDBC {
	public static Connection getConnection() throws Exception{
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;

	}
}
