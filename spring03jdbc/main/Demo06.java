package main;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

public class Demo06 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf01basic.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		String q = "SELECT * FROM emp";
		
		
		MyEmpRowCallBackHandler myEmpRowCallBackHandler = new MyEmpRowCallBackHandler(); 
		jdbcTemplate.query(q, myEmpRowCallBackHandler);
		
	}

}

class MyEmpRowCallBackHandler implements RowCallbackHandler{
	public void processRow(ResultSet rs) throws SQLException {
		int 	empId 		= rs.getInt("empno");
		String 	empName 	= rs.getString("ename");
		String 	desg 		= rs.getString("job");
		Date 	hireDate 	= rs.getDate("hiredate");
		double 	sal 		= rs.getDouble("sal");
		double 	comm 		= rs.getDouble("comm");
		int 	dept 		= rs.getInt("deptno");
		System.out.println(empId + " " + empName + " " + desg + " "  + sal + " " + comm + " " + hireDate + " " + dept);
	}
}
