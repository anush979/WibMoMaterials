package main;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import entity.Employee;

public class Demo05 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf01basic.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		String q = "SELECT ename FROM emp WHERE empno=7369";
		
		String name = jdbcTemplate.queryForObject(q, String.class);
		
		System.out.println("NAME : " + name);
		
		q = "SELECT * FROM emp"; 
		EmployeeMapper empRowMapper = new EmployeeMapper();
		
		List<Employee> empList =  jdbcTemplate.query(q, empRowMapper);
		
		for(Employee e : empList) {
			System.out.println(e);
		}
	}

}

class EmployeeMapper implements RowMapper<Employee>{
	
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		int 	empId 		= rs.getInt("empno");
		String 	empName 	= rs.getString("ename");
		String 	desg 		= rs.getString("job");
		Date 	hireDate 	= rs.getDate("hiredate");
		double 	sal 		= rs.getDouble("sal");
		double 	comm 		= rs.getDouble("comm");
		int 	dept 		= rs.getInt("deptno");
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setDesg(desg);
		e.setHireDate(hireDate);
		e.setSal(sal);
		e.setComm(comm);
		e.setDept(dept);
		return e;
	}
}
