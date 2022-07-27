public class TestMain17 {
	public static void main(String[] args) {
		Employee17 e1 = new Employee17("9179", "SUGNANA", "TRAINER", "TRAINING");
		e1.display();
		System.out.println("e1            : " + e1);
		System.out.println("e1.toString() : " + e1.toString());
		
		System.out.println("e1.hashCode() : " + e1.hashCode());
		String hc = Integer.toHexString(e1.hashCode());
		System.out.println("e1.hashCode() : " + hc);
	}
}
class Employee17{
	String empId;
	String empName;
	String dept;
	String desg;
	public Employee17(String empId, String empName, String dept, String desg) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
	}
	public int hashCode() {
		return empId.hashCode() + empName.hashCode() + dept.hashCode() + desg.hashCode();
	}
//	public String toString() {
//		//return "Hello";
//		return empId + " " + empName + " " + dept + " " + desg;
//	}
	void display(){
		System.out.println("ID   : " + empId);
		System.out.println("NAME : " + empName);
		System.out.println("DEPT : " + dept);
		System.out.println("DESG : " + desg);
		System.out.println("-----------------------------");
	}
}
