import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.annotation.Address;
import entity.annotation.Employee;

public class Test04Hibernate02LazyFetchDemo {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();	
		
		Employee e1 = session.get(Employee.class, 9179);

		System.out.println(e1);
		
//		Collection<Address> empAddressList = e1.getEmpAddressList();
//		for(Address a : empAddressList) {
//			System.out.println(a);
//		}
		transactin.commit();
		session.close();

		Collection<Address> empAddressList = e1.getEmpAddressList();
		for(Address a : empAddressList) {
			System.out.println(a);
		}
	}
}
