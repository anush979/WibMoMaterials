package dao;

import entities.Department;
import entities.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class DepartmentDAO {
	public Department getDepartmentById(int deptNo) throws Exception{
		Connection conn = ConnectionForJDBC.getConnection();
		Statement stmt = conn.createStatement();
		String q = "SELECT * FROM dept WHERE deptno=" + deptNo;
		ResultSet rs = stmt.executeQuery(q);
		Department d = null;
		if(rs.next()) {
			d = new Department();
			d.setDeptId(deptNo);;
			d.setDeptName(rs.getString("dname"));
			d.setLocation(rs.getString("loc"));
		}
		conn.close();
		return d;
	}
	public List<Department> getAllDepartments() throws Exception{
		Connection conn = ConnectionForJDBC.getConnection();
		Statement stmt = conn.createStatement();
		String q = "SELECT * FROM dept";
		ResultSet rs = stmt.executeQuery(q);
		ArrayList<Department> deptList = new ArrayList<Department>();
		Department d = null;
		while(rs.next()) {
			d = new Department();
			d.setDeptId(rs.getInt("deptno"));
			d.setDeptName(rs.getString("dname"));
			d.setLocation(rs.getString("loc"));
			deptList.add(d);
		}
		conn.close();
		return deptList;
	}
	
	public int insertDepartment(Department d) throws Exception {
		int deptId = d.getDeptId();
		String deptName = d.getDeptName();
		String location = d.getLocation();
		
		Connection conn = ConnectionForJDBC.getConnection();
		Statement stmt = conn.createStatement();
		
		String q = "INSERT INTO dept(deptno, dname, loc) VALUES(" + deptId +", '" + deptName + "', '" + location + "')";

		int i = stmt.executeUpdate(q);
		conn.close();
		return i;
	}
	
	public int updateDepartmentById(int deptNo, Department d) throws Exception{
		Connection conn = ConnectionForJDBC.getConnection();
		Statement stmt = conn.createStatement();
		//DNAME, LOCATION
		String deptName = d.getDeptName();
		String location = d.getLocation();

		String q = "UPDATE dept SET dname = '" + deptName + "', loc = '" + location + "' WHERE empno = " + deptNo;
		int i = stmt.executeUpdate(q);
		conn.close();
		return i;
	}
	public int deleteDepartmentById(int deptNo) throws Exception {
		Connection conn = ConnectionForJDBC.getConnection();
		Statement stmt = conn.createStatement();
		String q = "DELETE FROM dept WHERE deptno=" + deptNo;
		int i = stmt.executeUpdate(q);
		conn.close();
		return i;
	}
}
