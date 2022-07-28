package entity.annotation;

import java.util.*;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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

	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="emp_address", joinColumns=@JoinColumn(name="empno"))
	private Collection<Address> empAddressList = new HashSet<Address>();
////////////////////////////////////////////Only with Hibernate API/////////////////////////////////////////////////////////////////////////////////////////////
//	@ElementCollection
//	@JoinTable(name="emp_address", joinColumns=@JoinColumn(name="empno"))
//	@GenericGenerator(name="hilo-gen", strategy = "increment")													//Hibernate Annotation
//	@CollectionId(columns = {@Column(name="addressid")}, generator = "hilo-gen", type=@Type(type="integer"))	//Hibernate Annotation
//	private Collection<Address> empAddressList = new ArrayList<Address>();
////////////////////////////////////////////Only with Hibernate API/////////////////////////////////////////////////////////////////////////////////////////////

	public Employee() {}
	public Employee(int empId, String empName, String dept, String desg) {
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
	public Collection<Address> getEmpAddressList() {
		return empAddressList;
	}
	public void setEmpAddressList(Set<Address> empAddressList) {
		this.empAddressList = empAddressList;
	}
	
	public String toString() {
		return empId + " " + empName + " " + dept + " " + desg;
	}
}
