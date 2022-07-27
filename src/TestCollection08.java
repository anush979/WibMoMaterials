import java.util.*;
public class TestCollection08 {
	public static void main(String[] args) {
		EmployeeC08 e1 =  new EmployeeC08("9179", "SUGNANA",  "TRAINING",  "TRAINER");
		EmployeeC08 e2 =  new EmployeeC08("1279", "SRINIVAS", "TRAINING",  "MANAGER");
		EmployeeC08 e3 =  new EmployeeC08("3490", "AJITH",    "ACCOUNTS",  "CLERK");
		EmployeeC08 e4 =  new EmployeeC08("7190", "MAHESH",   "MARKETING", "MANAGER");
		EmployeeC08 e5 =  new EmployeeC08("6109", "SUMEETH",  "ACCOUNTS",  "MANAGER");
		EmployeeC08 e6 =  new EmployeeC08("7012", "NARAYAN",  "ADMIN",     "MANAGER");
		EmployeeC08 e7 =  new EmployeeC08("2097", "VINAY",    "MARKETING", "EXECUTIVE");
		EmployeeC08 e8 =  new EmployeeC08("4156", "RAGHU",    "ADMIN",     "CLERK");
		EmployeeC08 e9 =  new EmployeeC08("6561", "VIKRAM",   "ACCOUNTS",  "SENIOR-CLERK");
		EmployeeC08 e10 = new EmployeeC08("3910", "RAVI",     "MARKETING", "SENIOR-EXE");
		
//		CompareEmployeesById   ceid = new CompareEmployeesById();
//		CompareEmployeesByName  cen = new CompareEmployeesByName();
		//TreeSet<EmployeeC08> ts1 = new TreeSet<EmployeeC08>(cen);
		//TreeSet<EmployeeC08> ts1 = new TreeSet<EmployeeC08>((o1, o2)-> o1.empId.compareTo(o2.empId));
		TreeSet<EmployeeC08> ts1 = new TreeSet<EmployeeC08>((EmployeeC08 o1, EmployeeC08 o2)-> {return o1.empName.compareTo(o2.empName);});

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
		
		for(EmployeeC08 e : ts1) {
			System.out.println(e);
		}
	}
}
//class CompareEmployeesById implements Comparator<EmployeeC08>{
//	public int compare(EmployeeC08 e1, EmployeeC08 e2) {
//		return e1.empId.compareTo(e2.empId);
//	}
//}
//class CompareEmployeesByName implements Comparator<EmployeeC08>{
//	public int compare(EmployeeC08 e1, EmployeeC08 e2) {
//		return e1.empName.compareTo(e2.empName);
//	}
//}
class EmployeeC08 {
	String empId;
	String empName;
	String dept;
	String desg;
	public EmployeeC08(String empId, String empName, String dept, String desg) {
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
}

