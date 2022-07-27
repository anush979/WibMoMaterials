import java.sql.*;
public class Test03JDBCUpdate {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									

		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);			
		
		Statement stmt = conn.createStatement();
		String q = "UPDATE emp SET job='TRAINER' WHERE empno=9179";
				
		System.out.println("stmt.execute(q) : " + stmt.execute(q));

		conn.close();
		System.out.println("Record Updated Succesfully......");

	}
}
