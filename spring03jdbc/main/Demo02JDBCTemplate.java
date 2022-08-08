package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo02JDBCTemplate {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf01basic.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		String q = "SELECT ename FROM emp WHERE empno=7369";
		String name = jdbcTemplate.queryForObject(q, String.class);
		System.out.println("NAME : " + name);
		
		q = "SELECT COUNT(*) FROM emp";
		int count = jdbcTemplate.queryForObject(q, Integer.class);
		System.out.println("TOTAL NO OF EMPLOYEES : " + count);
		
		q = "SELECT COUNT(*) FROM emp WHERE sal > ?";
		count = jdbcTemplate.queryForObject(q, Integer.class);
		System.out.println("count : " + count);

		System.out.println("Successful........");
	}

}
