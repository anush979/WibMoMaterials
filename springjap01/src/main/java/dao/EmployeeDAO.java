package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import java.util.*;
import entity.annotation.Employee;

@Component("employeeDAO")
public class EmployeeDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Employee getEmployeeById(int empId) {
		
		return entityManager.find(Employee.class, empId);
	}
	
	public List<Employee> getAllEmployees(){
		TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);
		return query.getResultList();
	}

}
