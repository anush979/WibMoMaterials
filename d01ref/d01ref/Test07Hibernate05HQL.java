package d01ref;

import javax.persistence.TypedQuery;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import d01ref.entity.annotation.*;

public class Test07Hibernate05HQL {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();
		configuration = configuration.configure();			
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();		
		
		//TypedQuery<Employee> query =  session.createQuery("FROM Employee");
/*		TypedQuery<Employee> query =  session.createQuery("FROM Employee WHERE desg='MANAGER'");
		List<Employee> empList = query.getResultList();
		
		for(Employee e : empList) {
			System.out.println(e);
		}
*/
		
/*		TypedQuery<String> query = 	session.createQuery("SELECT empName FROM Employee"); 
 		List<String> names = query.getResultList(); 
 		for(String n : names) { 
 			System.out.println(n); 
 		}
 */		
		
/*		TypedQuery<Object[]> query = session.createQuery("SELECT empName, dept, desg FROM Employee");
		List<Object[]> empDetails = query.getResultList();
		for(Object oArray[] : empDetails) {
			System.out.println(oArray[0] + " " + oArray[1] + " " + oArray[2]);
		}
*/

/*		TypedQuery<Employee> query = session.createQuery("FROM Employee WHERE dept=?1 AND desg=?2");
		query.setParameter(1, "SALES");
		query.setParameter(2, "MANAGER");
*/		
		
		TypedQuery<Employee> query = session.createQuery("FROM Employee WHERE dept=:dpt AND desg=:dsg");
		query.setParameter("dpt", "SALES");
		query.setParameter("dsg", "MANAGER");
		
		
		List<Employee> empList = query.getResultList();
		for(Employee e : empList) {
			System.out.println(e);
		}

		
		transactin.commit();
		session.close();
		
		System.out.println("Hibernate Connectin established successfully......");
	}
}


//SQL
//SELECT * FROM emp;
//SELECT * FROM emp WHERE empno=9064;
