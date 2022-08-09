package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.annotation.Employee;

public class Demo01 {
	public static void main(String[] args) throws Exception{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		//Employee e1 = new Employee(9179, "SUGNANA", "TRAINING", "TRAINER");
		
		//entityManager.persist(e1);
		
		Employee e1 = entityManager.find(Employee.class, 9179);
		System.out.println(e1);
				
		
		entityTransaction.commit();
		entityManager.close();
		System.out.println("New Employee Inserted");
	}
}

//public static void main(String[] args) throws Exception{
//	Configuration configuration = new Configuration();					
//	configuration = configuration.configure();							
//	SessionFactory sessionFactory = configuration.buildSessionFactory();
//	Session session = sessionFactory.openSession();						 
//	Transaction transactin = session.beginTransaction();	
//	
//	Employee e = session.get(Employee.class, 6102);
//	session.save(e);
//	System.out.println(e);
//	transactin.commit();
//	session.close();
//}
