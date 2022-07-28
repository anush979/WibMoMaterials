

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.annotation.*;

public class Test01HibernateOneToMany {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();				

		Employee e1 = new Employee(9179, "SUGNANA", "TRAINER", "TRAINING");
		Address a1 = new Address(1001, "1234", "1st-Main",  "JAYNAGAR", "BANGALORE", "560010");
		Address a2 = new Address(1002, "4567", "2nd-Cross", "JAYNAGAR", "CHENNAI",   "660016");
		Address a3 = new Address(1003, "1111", "1st-Main",  "JAYNAGAR", "HYDRABAD",  "560010");
		Address a4 = new Address(1004, "5111", "1st-Main",  "JAYNAGAR", "MUMBAI",    "460014");

		
		Employee e2 = new Employee(9179, "SUGNANA", "TRAINER", "TRAINING");
		Address a5 = new Address(1001, "1234", "1st-Main",  "JAYNAGAR", "BANGALORE", "560010");
		Address a6 = new Address(1002, "4567", "2nd-Cross", "JAYNAGAR", "CHENNAI",   "660016");
		Address a7 = new Address(1003, "1111", "1st-Main",  "JAYNAGAR", "HYDRABAD",  "560010");
		Address a8 = new Address(1004, "5111", "1st-Main",  "JAYNAGAR", "MUMBAI",    "460014");

		e1.getEmpAddressLsit().add(a1);
		e1.getEmpAddressLsit().add(a2);
		e1.getEmpAddressLsit().add(a3);
		e1.getEmpAddressLsit().add(a4);
		
		session.save(e1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		
		
		transactin.commit();
		session.close();
		
	}

}
