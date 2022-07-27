
public class Employee {
	private int empId;
	private String empName;
	private int dept;
	private String desg;
	
	public Employee() {}
	
	public int getEmpId() {				//Read access to empId
		return empId;
	}
	public void setEmpId(int empId) {	//Write access to empId
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg ;
	}
	
}
