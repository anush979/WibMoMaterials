import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.EmployeeDAO;
import entity.Employee;

public class EmployeeModel {

	public Employee login(String userName, String password) {
		Employee emp = null;
		EmployeeDAO employeeDAO = new EmployeeDAO();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password1 = "root";

			Connection conn = DriverManager.getConnection(url, user, password1);
			
			Statement stmt = conn.createStatement();
			String q = "SELECT empno FROM emp WHERE ename='" + userName + "'";
			//System.out.println(q);
			Integer pass = 0;			//Using empno as password
			
			ResultSet rs =  stmt.executeQuery(q);
			if(rs.next()) {
				pass = rs.getInt("empno");
			} 
			
			if(password.equals(pass.toString())) {
				emp = employeeDAO.getEmployeeById(pass);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return emp;
	}

}
