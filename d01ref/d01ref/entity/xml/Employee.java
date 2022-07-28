package d01ref.entity.xml;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	private String desg;
	public Employee() {}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg;
	}	
}