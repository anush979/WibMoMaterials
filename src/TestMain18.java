public class TestMain18 {
	public static void main(String[] args) {
		Employee18 e1 = new Employee18("9179", "SUGNANA", "TRAINER", "TRAINING");
		Employee18 e2 = e1;
		Employee18 e3 = new Employee18("9179", "SUGNANA", "TRAINER", "TRAINING");

		e1.display();
		e2.display();
		e3.display();
		System.out.println("e1 : " + e1);
		System.out.println("e2 : " + e2);
		System.out.println("e3 : " + e3);

		System.out.println("e1.hashCode() : " + e1.hashCode());
		System.out.println("e2.hashCode() : " + e2.hashCode());
		System.out.println("e3.hashCode() : " + e3.hashCode());

		System.out.println("e1 == e2 : " + (e1 == e2));
		System.out.println("e1 == e3 : " + (e1 == e3));
		System.out.println("e1.empName == e3.empName : " + (e1.empName == e3.empName));
		System.out.println("e1.equals(e2) : " + e1.equals(e2));
		System.out.println("e1.equals(e3) : " + e1.equals(e3));
	}
}
class Employee18{
	String empId;
	String empName;
	String dept;
	String desg;
	public Employee18(String empId, String empName, String dept, String desg) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
	}
	public boolean equals(Object emp) {
		if(!(emp instanceof Employee18)) {
			return false;
		}
		Employee18 e = (Employee18)emp;
		boolean result = empId.equals(e.empId) && empName.equals(e.empName) && dept.equals(e.dept) && desg.equals(e.desg);
		return result;
	}
	void display(){
		System.out.println("ID   : " + empId);
		System.out.println("NAME : " + empName);
		System.out.println("DEPT : " + dept);
		System.out.println("DESG : " + desg);
		System.out.println("-----------------------------");
	}
}
