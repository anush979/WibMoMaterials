package d02valuetype;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import d01ref.entity.xml.Employee;
import d02valuetype.entity.annotation.Employee;

public class Test03Hibernate01 {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();	
		
		Employee e1 = new Employee(9179, "SUGNANA",  "TRAINING",  "TRAINER");
		Employee e2 = new Employee(1799, "SRINIVAS", "MANAGER",   "TRAINER");
		Employee e3 = new Employee(7991, "AJITH",    "CLERK",     "ACCOUNTS");
		Employee e4 = new Employee(5179, "MAHESH",   "EXECUTIVE", "SALES");
		Employee e5 = new Employee(3279, "SUMEETH",  "MANAGER",   "ACCOUNTS");
		Employee e6 = new Employee(5612, "RAGHU",    "EXECUTIVE", "SALES");
		Employee e7 = new Employee(4901, "RAVI",     "MANAGER",   "SALES");
		Employee e8 = new Employee(2166, "PRAVEEN",  "DEVELOPER", "PRODUCTION");
		Employee e9 = new Employee(6102, "CHETAN", "  TESTING",   "PRODUCTION");
		
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(e6);
		session.save(e7);
		session.save(e8);
		session.save(e9);

		transactin.commit();
		session.close();
		
		System.out.println("First Employee Object Saved to Table emp......");
	}
}
