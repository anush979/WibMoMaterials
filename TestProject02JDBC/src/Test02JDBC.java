import java.sql.*;

public class Test02JDBC {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");									

		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);			
		
		Statement stmt = conn.createStatement();
		
		String q = "SELECT * FROM emp";
		ResultSet rs = stmt.executeQuery(q);
		
		int empNo = 0;
		String name  = "";
		String job = "";
		int mgr = 0;
		Date date = null;
		double sal = 0;
		double comm = 0;
		int deptno = 0;
		while(rs.next()) {
			empNo  = rs.getInt("empno");		//rs.getInt(1);
			name   = rs.getString("ename");		//rs.getString(2);
			job    = rs.getString("job");		//rs.getString(3);
			mgr    = rs.getInt("mgr");			//rs.getInt(4);		
			date   = rs.getDate("hiredate");	//rs.getDate(5);
			sal    = rs.getDouble("sal");		//rs.getDouble(6);
			comm   = rs.getDouble("comm");		//rs.getDouble(7);
			deptno = rs.getInt("deptno");		//rs.getInt(8);
			System.out.println(empNo + " " + name + " " + job + " " + mgr + " " + date + " " + sal + " " + comm + " " + deptno);
		}
		
		conn.close();
	}
}