import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.annotation.*;

public class Test01HibernateTablePerHirearchy {
	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();					
		configuration = configuration.configure();							
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();						 
		Transaction transactin = session.beginTransaction();				
		Employee e1 = new Employee(9179, "SUGNANA",  "TRAINER",        "TRAINER");
		Employee e2 = new Employee(1151, "ANUSH",    "PRESIDENT",      "ADMINISTRATION");
		Employee e3 = new Employee(1234, "SIDDARTH", "VICE PRESIDENT", "ADMINISTRATION");
		Employee e4 = new Employee(7717, "GAURAV",   "DIRECTOR",       "SALES");
		Employee e5 = new Employee(7176, "ASHWIN",   "DIRECTOR",       "MARKETING");
				
		Manager m1 = new Manager(2910, "MAHESH",  "SALES MANAGER",     "SALES",     "INTERMIDIATE", "SALES",             1000);
		Manager m2 = new Manager(3601, "SUMEETH", "MANAGER",           "ACCOUNTS",  "JUNIOR",       "ACCOUTS",           1500);
		Manager m3 = new Manager(5432, "KIRAN",   "GENERAL MANAGER",   "SALES",     "SENIOR",       "CUSTOMER CARE",     1000);
		Manager m4 = new Manager(3611, "MANOJ",   "MARKETING MANAGER", "MARKETING", "INTERMIDIATE",  "MARKETING",        1000);
		Manager m5 = new Manager(4512, "SANDEEP", "MANAGER",           "MARKETING", "JUNIOR",        "RETAIL MARKETING", 900);
				
		Developer d1 = new Developer(5011, "AJITH",   "SENIOR DEVELOPER", "DEVELOPEMENT", "EXPERT LEVEL", "DATA BASE",         1000);
		Developer d2 = new Developer(4191, "NARAYAN", "DEVELOPER",        "PRODUCTION",   "MEDIUM LEVEL", "JAVA",              750);
		Developer d3 = new Developer(6166, "ARJUN",   "TESTER",           "TESTING",      "MEDIUM LEVEL", "MANUAL TESTING",    500);
		Developer d4 = new Developer(3123, "VIKRAM",  "TESTER",           "TESTING",      "ENTRY LEVEL",  "AUTOMATED TESTING", 500);
		Developer d5 = new Developer(1122, "CHETAN",  "DEVELOPER",        "DEVELOPEMENT", "MEDIUM LEVEL", "CPP",               5000);

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);

		session.save(m1);
		session.save(m2);
		session.save(m3);
		session.save(m4);
		session.save(m5);

		session.save(d1);
		session.save(d2);
		session.save(d3);
		session.save(d4);
		session.save(d5);

		transactin.commit();
		session.close();
		
	}
}