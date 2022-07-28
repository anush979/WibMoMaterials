package d01ref;

import java.util.*;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import d01ref.entity.annotation.Employee;

public class Test09Hibernate07CriteriaQueries {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();			
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();		

		//SELECT * FROM emp WHERE dept="ACCOUTS"
//		Criteria criteria = session.createCriteria(Employee.class);		//SELECT * FROM emp
//		criteria.add(Restrictions.eq("dept", "ACCOUNTS"));
//		criteria.add(Restrictions.eq("desg", "CLERK"));

		
//		Criteria criteria = session.createCriteria(Employee.class);
//		criteria.addOrder(Order.desc("empId"));
//		
//		List<Employee> empList = criteria.list();
//		
//		for(Employee e : empList) {
//			System.out.println(e);
//		}
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("empName")).addOrder(Order.asc("empName"));
		List<String> empData = criteria.list();
		for(String o : empData) {
			System.out.println(o);
		}
		transactin.commit();
		session.close();
	}
}
