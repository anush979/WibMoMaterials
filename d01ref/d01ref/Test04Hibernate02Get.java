package d01ref;

import org.hibernate.*;
import org.hibernate.cfg.*;
import d01ref.entity.annotation.*;

public class Test04Hibernate02Get {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();	
		
		Employee e = session.get(Employee.class, 6102);
		System.out.println(e);

		
		
		transactin.commit();
		session.close();

	
	}
}