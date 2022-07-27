import java.sql.*;
public class Test03JDBCInsert {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									

		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);			
		
		Statement stmt = conn.createStatement();
		//Use different empno for every new record INSERT
		String q = "INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
				+ "VALUES(1111, 'SUGNANA', 'TRAINER', 7902, '2002-7-1', 10000, 10000, 10);";
		System.out.println("stmt.execute(q) : " + stmt.execute(q));

		conn.close();
		System.out.println("New Record Inserted Succesfully......");
	}
}
