package d01ref;

import java.util.List;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import d01ref.entity.annotation.*;

public class Test08HIbernate06NamedQueries {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();
		configuration = configuration.configure();			
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();		

		TypedQuery<Employee> query = session.getNamedQuery("Employee.byId");
		query.setParameter(1, 9179);
		
		List<Employee> empList = query.getResultList();
		for(Employee e : empList) {
			System.out.println(e);
		}
		transactin.commit();
		session.close();
		
		System.out.println("Hibernate Connectin established successfully......");
	}

}
