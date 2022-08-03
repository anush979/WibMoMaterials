package dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import entities.*;

public class EmployeeDAO {
	private Connection getConnection() throws Exception{
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	public int updateEmployee(int empId, Employee e) throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		//JOB, MGR, SAL, COMM, DPT
		String job = e.getDesg();
		int mgr = e.getMgr();
		double sal = e.getSal();
		double comm = e.getComm();
		int deptNo = e.getDept();

		String q = "UPDATE emp SET job = '" + job + "', mgr = " + mgr + ", sal = " + sal + ", comm = " + comm + ", deptNo = " + deptNo;
		q = q + " WHERE empno = " + empId;
		return stmt.executeUpdate(q);
	}
	
	public int deleteEmployeeById(int empId) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		String q = "DELETE FROM emp WHERE empno=" + empId;
		return stmt.executeUpdate(q);
	}
	public int insertEmployee(Employee e) throws Exception {
		int empId = e.getEmpId();
		String empName = e.getEmpName();
		String job = e.getDesg();
		int mgr = e.getMgr();
		Date hireDate = e.getHireDate();
		double sal = e.getSal();
		double comm = e.getComm();
		int deptNo = e.getDept();
		
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		
		String q = "INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ";
		q = q + "VALUES(" + empId +", '" + empName + "', '" + job + "', " + mgr + ", '" + hireDate + "', " + sal + ", " + comm + ", " + deptNo + ")";

		int i = stmt.executeUpdate(q);
		return i;
	}
	public Employee getEmployeeById(int empId) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		String q = "SELECT * FROM emp WHERE empno=" + empId;
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
		String q = "SELECT * FROM emp";
		ResultSet rs = stmt.executeQuery(q);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee e = null;
		while(rs.next()) {
			e = new Employee();
			e.setEmpId(rs.getInt("empno"));
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
