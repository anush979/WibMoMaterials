package main;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAO;
import entity.annotation.Employee;

public class Demo01 {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config.xml");
		
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		Employee e = employeeDAO.getEmployeeById(7369);
		System.out.println(e);
		
		List<Employee> empList = employeeDAO.getAllEmployees();
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		
	}
}
