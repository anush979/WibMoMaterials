package d02valuetype.entity.annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name = "empno")
	private int empId;

	@Column(name = "name")
	private String empName;
	
	@Column(name = "department")
	private String dept;
	
	@Column(name = "designation")
	private String desg;
	//@Embedded
	private Address address;
	
	
	@AttributeOverrides({
			@AttributeOverride(name="doorNo", column=@Column(name="off_doorno")),
			@AttributeOverride(name="street", column=@Column(name="off_street")),
			@AttributeOverride(name="area",   column=@Column(name="off_area")),
			@AttributeOverride(name="city",   column=@Column(name="off_city")),
			@AttributeOverride(name="pin",    column=@Column(name="off_pin")),
		})
	private Address officeAddress;
	
	
	public Employee() {}
	public Employee(int empId, String empName, String dept, String desg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desg = desg;
		//this.address  = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}	
	
}
