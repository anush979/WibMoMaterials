package main;

import java.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo04 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf01basic.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		
		RowCallbackHandler rowCallbackHandler = new RowCallbackHandler() {
			//@Override
			public void processRow(ResultSet rs) throws SQLException {
				int empNo = rs.getInt(1);
				String eName = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				Date hireDate = rs.getDate(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				System.out.println(empNo + " " + eName + " " + job + " " + mgr + " " + hireDate + " " + sal + " " + comm + " " + deptno);
			}
		};
		String q = "SELECT * FROM emp";
		jdbcTemplate.query(q, rowCallbackHandler);
	}

}
