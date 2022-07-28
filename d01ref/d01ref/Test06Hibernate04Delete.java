package d01ref;

import org.hibernate.*;
import org.hibernate.cfg.*;
import d01ref.entity.annotation.*;

public class Test06Hibernate04Delete {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();	
		
		Employee e = session.get(Employee.class, 6102);
		session.delete(e);
		
		transactin.commit();
		session.close();
	}
}