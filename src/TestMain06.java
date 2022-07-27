public class TestMain06 {
	public static void main(String[] args) {
		Employee06 e1 = new Employee06("9179", "SUGNANA", "TRAINING", "TRAINER");
		Manager06 m1 = new Manager06("1111", "SRINIVAS", "TRAINING", "MANAGER", 10000);
		
		e1.display();
		m1.display();
		
		final int i = 10;
		final Employee06 e = new Employee06("", "", "", "");
	}
}

class Employee06{
	String empId;
	String empName;
	String dept;
	String desg;
	public Employee06(String empId, String empName, String dept, String desg) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
	}
	void display(){
		System.out.println("ID   : " + empId);
		System.out.println("NAME : " + empName);
		System.out.println("DEPT : " + dept);
		System.out.println("DESG : " + desg);
		System.out.println("-----------------------------");
	}
}
class Manager06 extends Employee06{	
	double allowance;
	public Manager06(String empId, String empName, String dept, String desg, double allowance) {
		super(empId, empName, dept, desg);
		this.allowance = allowance;
	}
	void display() {
		System.out.println("ID   : " + empId);
		System.out.println("NAME : " + empName);
		System.out.println("DEPT : " + dept);
		System.out.println("DESG : " + desg);
		System.out.println("ALLO : " + allowance);
		System.out.println("-----------------------------");
	}
}
