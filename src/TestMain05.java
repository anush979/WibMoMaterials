public class TestMain05 {
	public static void main(String[] args) {
		System.out.println("Start of Application");

		Employee05  e1 = new Employee05();
		Manager05   m1 = new Manager05();
		Developer05 d1 = new Developer05();
		
		Employee05 e2;
		e2 = e1;
		
		e2 = m1;
		e2 = d1;
		
		Manager05 m2;
		m2 = m1;
		e1 = m1;
		
		m2 = (Manager05)e1;
		//m2 = (Manager05)d1;
		
		Developer05 d2;
		d2 = d1;
		//e1 = d1;
		
		d2 = (Developer05)e1;
		//d2 = (Developer05)m1;
		System.out.println("End of Application");
	}
}
//Child  class Object can be used in    Parent class Reference
//Parent class object cannot be used in Child class Reference

class Employee05 {
	String empId;
	String empName;
	String dept;
	String desg;
	//void display(){}
	//.
	//
	
}

class Manager05 extends Employee05{
	double allowance;
}
class GneralManager extends Manager05{}


class Developer05 extends Employee05{
	double devAllowance;
}