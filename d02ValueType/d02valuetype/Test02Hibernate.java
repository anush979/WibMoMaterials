package d02valuetype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import d02valuetype.entity.annotation.*;

public class Test02Hibernate {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();	
		
		Employee e1 = new Employee(9179, "SUGNANA",  "TRAINING",  "TRAINER");
		Address a1 = new Address("1234", "1st-MAIN", "JAYNAGAR", "BANGALOER", "560010");
		Address o1 = new Address("999", "10th-MAIN", "RMV", "BANGALOER", "560100");

		e1.setAddress(a1);
		e1.setOfficeAddress(o1);
		
		session.save(e1);
		transactin.commit();
		session.close();
		
		System.out.println("First Employee Object Saved to Table emp......");
	}

}
