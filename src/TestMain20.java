public class TestMain20 {
	public static void main(String[] args) throws Exception{
		Employee20 e1 = new Employee20("9179", "SUGNANA", "TRAINER", "TRAINING");
		Employee20 e2 = e1.getClone();
		//Employee20 e2 = (Employee20) e1.clone();
		System.out.println("e1 : " + e1);
		System.out.println("e2 : " + e2);
		
	}
}
class Employee20 implements Cloneable {
	String empId;
	String empName;
	String dept;
	String desg;
	public Employee20(String empId, String empName, String dept, String desg) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
	}
	public Employee20 getClone() throws CloneNotSupportedException {
		return (Employee20) clone();
	}
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg;
	}
	public boolean equals(Object emp) {
		if(!(emp instanceof Employee20)) {
			return false;
		}
		Employee20 e = (Employee20)emp;
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
