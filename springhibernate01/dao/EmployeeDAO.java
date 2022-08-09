package dao;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entity.annotation.Employee;

@Component("empDAO")
public class EmployeeDAO {
	private SessionFactory sessionFactory;
	@Autowired
	public EmployeeDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Employee getEmployeeById(int empId) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e = session.get(Employee.class, empId);
		
		transaction.commit();
		session.close();
		return e;
	}
	
	public List<Employee> getAllEmployee() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		TypedQuery<Employee> query = session.createQuery("FROM Employee");

		List<Employee> empList = query.getResultList();
		
		transaction.commit();
		session.close();
		return empList;
	}
}
