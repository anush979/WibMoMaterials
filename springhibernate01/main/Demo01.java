package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAO;
import entity.annotation.Employee;

public class Demo01 {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config.xml");
//		Configuration configuration = new Configuration();					
//		configuration = configuration.configure();							
//		SessionFactory sessionFactory = configuration.buildSessionFactory();

//		SessionFactory sessionFactory = (SessionFactory)context.getBean("hibSessionFactory");
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Employee e = session.get(Employee.class, 7369);
		EmployeeDAO empDAO = (EmployeeDAO)context.getBean("empDAO");
		Employee e = empDAO.getEmployeeById(7369);
		
		List<Employee> empList = empDAO.getAllEmployee();
		
		System.out.println("*******************************************************************");
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		System.out.println(e);
		System.out.println("Test Conf......");
	}
}
