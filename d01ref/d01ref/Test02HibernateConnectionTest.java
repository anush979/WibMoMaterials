package d01ref;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test02HibernateConnectionTest {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					//Creating New Configuration object
		configuration = configuration.configure();							//Loading  hibernate.cfg.xml file
		SessionFactory sessionFactory = configuration.buildSessionFactory();//Getting SessionFactory for configuration object
		Session session = sessionFactory.openSession();						//Getting Session object from SessionFactory 
		Transaction transactin = session.beginTransaction();				//Getting Transaction object from Session
		
		///
		//
		//
		
		transactin.commit();
		session.close();
		
		System.out.println("Hibernate Connectin established successfully......");
	}
}
