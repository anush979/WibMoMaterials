import java.sql.*;
public class Test04JDBCDelete {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									

		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);			
		
		Statement stmt = conn.createStatement();
		String q = "DELETE FROM emp WHERE empno=9179";
				
		System.out.println("stmt.execute(q) : " + stmt.execute(q));

		stmt.close();
		conn.close();
		System.out.println("Record Deleted Succesfully......");

	}
}
