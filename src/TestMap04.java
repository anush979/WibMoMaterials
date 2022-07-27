import java.util.*;
public class TestMap04 {
	public static void main(String[] args) {
		EmployeeM04 e1 = new EmployeeM04("9179", "SUGNANA");
		EmployeeM04 e2 = new EmployeeM04("1119", "SRINIVAS");
		EmployeeM04 e3 = new EmployeeM04("2229", "MAHESH");
		
		//HashMap<EmployeeM04 , String> map = new HashMap<>();
		WeakHashMap<EmployeeM04 , String> map = new WeakHashMap<>();
		map.put(e1, "SUGNANA-GS");
		map.put(e2, "SRINIVAS-R");
		map.put(e3, "MAHESH-GM");
		System.out.println(map);
		e1 = null;
		System.gc();
		System.out.println(map);
		
	}
}

class EmployeeM04 {
	String empId;
	String empName;

	public EmployeeM04(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public String toString() {
		return empId + "-" + empName;
	}
}
