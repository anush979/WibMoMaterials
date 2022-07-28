package entity.annotation;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String dept;
	private String desg;
	@OneToMany
	@JoinTable(name = "empaddress", joinColumns = @JoinColumn(name="empid"), inverseJoinColumns = @JoinColumn(name="addressid"))
	private List<Address> empAddressLsit = new ArrayList<Address>();
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
	public List<Address> getEmpAddressLsit() {
		return empAddressLsit;
	}
	public void setEmpAddressLsit(List<Address> empAddressLsit) {
		this.empAddressLsit = empAddressLsit;
	}
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg;
	}	
}