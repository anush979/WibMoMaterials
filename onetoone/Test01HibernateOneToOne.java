

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.annotation.*;

public class Test01HibernateOneToOne {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();				
		Employee e1 = new Employee(9179, "SUGNANA", "TRAINER", "TRAINING");
		Address a1 = new Address(1001, "1234", "1st-Main", "JAYNAGAR", "BANGALORE", "560010");
		e1.setAddress(a1);
		
		session.save(e1);
		session.save(a1);
		
		
		transactin.commit();
		session.close();
		
	}

}
