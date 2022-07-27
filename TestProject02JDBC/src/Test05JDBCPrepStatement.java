import java.sql.*;
public class Test05JDBCPrepStatement {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									

		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);	
		String q = "INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		//                1  2  3  4  5  6  7  8
		PreparedStatement ps =  conn.prepareStatement(q);
		ps.setInt(1, 9179);
		ps.setString(2, "SUGNANA");
		ps.setString(3, "TRAINER");
		ps.setInt(4, 7902);
		//ps.setDate(5, new Date(2002, 7, 1));
		ps.setDate(5, Date.valueOf("2002-07-01"));
		ps.setDouble(6, 10000);
		ps.setDouble(7, 10000);
		ps.setInt(8, 10);
		
		ps.execute();
		
		ps.close();
		conn.close();
		System.out.println("Successfully Inserted new Record.....");
	}
}
// 