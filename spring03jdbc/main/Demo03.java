package main;

import entity.*;
import java.util.*;
import java.sql.*;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Demo03 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf01basic.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		
		
		
		
		String q = "SELECT * FROM emp WHERE empno=?";
		RowMapper<Employee> employeeRowMapper = new RowMapper<Employee>() {
			//@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setEmpId(rs.getInt("empno"));
				e.setEmpName(rs.getString("ename"));
				e.setDesg(rs.getString("job"));
				e.setHireDate(rs.getDate("hiredate"));
				e.setSal(rs.getDouble("sal"));
				e.setComm(rs.getDouble("comm"));
				e.setDept(rs.getInt("deptno"));
				return e;
			}
		};
		
		List<Employee> eList = jdbcTemplate.query(q, employeeRowMapper, 7499);
		for(Employee e : eList) {
			System.out.println(e);
		}
		q = "SELECT * FROM emp";
		eList = jdbcTemplate.query(q, employeeRowMapper);
		for(Employee e : eList) {
			System.out.println(e);
			System.out.println("-------------------------------------------------------------------------------------");
		}

	}

}
