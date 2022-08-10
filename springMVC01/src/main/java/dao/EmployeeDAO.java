package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import entity.Employee;

@Component
public class EmployeeDAO {
	private Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	public Employee getEmployeeById(int empId) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		String q = "SELECT * FROM emp WHERE empno=" + empId;
		//System.out.println(q);
		ResultSet rs = stmt.executeQuery(q);
		Employee e = null;
		if(rs.next()) {
			e = new Employee();
			e.setEmpId(empId);
			e.setEmpName(rs.getString("ename"));
			e.setDesg(rs.getString("job"));
			e.setHireDate(rs.getDate("hiredate"));
			e.setSal(rs.getDouble("sal"));
			e.setComm(rs.getDouble("comm"));
			e.setMgr(rs.getInt("mgr"));
			e.setDept(rs.getInt("deptno"));
		}
		conn.close();
		return e;
	}
	public List<Employee> getAllEmployees() throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		String q = "SELECT empno, ename, job, deptno FROM emp";
		ResultSet rs = stmt.executeQuery(q);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee e = null;
		while(rs.next()) {
			e = new Employee();
			e.setEmpId(rs.getInt("empid"));
			e.setEmpName(rs.getString("ename"));
			e.setDesg(rs.getString("job"));
			e.setHireDate(rs.getDate("hiredate"));
			e.setSal(rs.getDouble("sal"));
			e.setComm(rs.getDouble("comm"));
			e.setMgr(rs.getInt("mgr"));
			e.setDept(rs.getInt("deptno"));
			employeeList.add(e);
		}
		conn.close();
		return employeeList;
	}

}
