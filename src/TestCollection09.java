import java.util.*;
public class TestCollection09 {
	public static void main(String[] args) {
		EmployeeC09 e1 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC09 e2 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC09 e3 = e1;
		EmployeeC09 e4 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC09 e5 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC09 e6 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC09 e7 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC09 e8 =  new EmployeeC09("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		
		System.out.println("e1.hashCode() : " + e1.hashCode());
		System.out.println("e2.hashCode() : " + e2.hashCode());
		
		HashSet<EmployeeC09> hs1 = new HashSet<EmployeeC09>();
		hs1.add(e1);
		hs1.add(e2);
		hs1.add(e3);
		hs1.add(e4);
		hs1.add(e5);
		hs1.add(e6);
		hs1.add(e7);
		hs1.add(e8);
		for(EmployeeC09 e : hs1) {
			System.out.println(e);
		}
	}
}
class EmployeeC09 {
	String empId;
	String empName;
	String dept;
	String desg;
	public EmployeeC09(String empId, String empName, String dept, String desg) {
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
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg;
	}
	public int hashCode() {
		return empId.hashCode() + empName.hashCode() + dept.hashCode() + desg.hashCode();
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof EmployeeC09)) {
			return false;
		}
		EmployeeC09 e = (EmployeeC09)obj;
		return empId.equals(e.empId) && empName.equals(e.empName) && dept.equals(e.dept) && desg.equals(e.desg) ;
	}
}