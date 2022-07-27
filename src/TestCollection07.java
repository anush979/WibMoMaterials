import java.util.*;
public class TestCollection07 {
	public static void main(String[] args) {
		EmployeeC07 e1 =  new EmployeeC07("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC07 e2 =  new EmployeeC07("1279", "SRINIVAS", "TRAINING",  "MANAGER");
		EmployeeC07 e3 =  new EmployeeC07("3490", "AJITH",    "ACCOUNTS",  "CLERK");
		EmployeeC07 e4 =  new EmployeeC07("7190", "MAHESH",   "MARKETING", "MANAGER");
		EmployeeC07 e5 =  new EmployeeC07("6109", "SUMEETH",  "ACCOUNTS",  "MANAGER");
		EmployeeC07 e6 =  new EmployeeC07("7012", "NARAYAN",  "ADMIN",     "MANAGER");
		EmployeeC07 e7 =  new EmployeeC07("2097", "VINAY",    "MARKETING", "EXECUTIVE");
		EmployeeC07 e8 =  new EmployeeC07("4156", "RAGHU",    "ADMIN",     "CLERK");
		EmployeeC07 e9 =  new EmployeeC07("6561", "VIKRAM",   "ACCOUNTS",  "SENIOR-CLERK");
		EmployeeC07 e10 = new EmployeeC07("3910", "RAVI",     "MARKETING", "SENIOR-EXE");
		
		TreeSet<EmployeeC07> ts1 = new TreeSet<EmployeeC07>();
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		ts1.add(e6);
		ts1.add(e7);
		ts1.add(e8);
		ts1.add(e9);
		ts1.add(e10);
		
		for(EmployeeC07 e : ts1) {
			System.out.println(e);
		}
	}
}
class EmployeeC07 implements Comparable<EmployeeC07>{
	String empId;
	String empName;
	String dept;
	String desg;
	public EmployeeC07(String empId, String empName, String dept, String desg) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
	}
	public int compareTo(EmployeeC07 e) {
		//return empId.compareTo(e.empId);
		return empName.compareTo(e.empName);
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
}
