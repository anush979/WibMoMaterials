package d01ref.entity.annotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "emp")

@NamedQuery(name = "Employee.byId", query = "FROM Employee WHERE empId=?1" )

public class Employee {
	@Id
	private int empId;
	private String empName;
	private String dept;
	private String desg;
	public Employee() {}
	public Employee(int empId, String empName, String desg, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
	}
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
