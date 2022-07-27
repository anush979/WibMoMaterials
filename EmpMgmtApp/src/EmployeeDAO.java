import java.util.*;
import java.io.FileReader;
import java.sql.*;
public class EmployeeDAO {
	public static void main(String[] args) throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		Employee e = dao.getEmployeeById(7369);
		System.out.println(e);
		
		System.out.println("************GET ALL EMPLOYEES************************");
		List<Employee> employees = dao.getAllEmployees();
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		//Connection conn = getConnection();
		//System.out.println("Connection successful...." + conn);
	}
	
	private Connection getConnection() throws Exception{
		FileReader propertiesFileFeader = new FileReader("D:\\eclipse\\workspace\\RoughWorkSpace\\EmpMgmtApp\\app.properties");
		Properties properties = new Properties();
		properties.load(propertiesFileFeader);

		String driverClassName = properties.getProperty("driverClass");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	public Employee getEmployeeById(int empId) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		String q = "SELECT ename, job, deptno FROM emp WHERE empno="+empId;
		ResultSet rs = stmt.executeQuery(q);
		Employee e = null;
		if(rs.next()) {
			e = new Employee();
			e.setEmpId(empId);
			e.setEmpName(rs.getString("ename"));
			e.setDesg(rs.getString("job"));
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
			e.setEmpId(rs.getInt("empno"));
			e.setEmpName(rs.getString("ename"));
			e.setDesg(rs.getString("job"));
			e.setDept(rs.getInt("deptno"));
			employeeList.add(e);
		}
		conn.close();
		return employeeList;
	}
}
