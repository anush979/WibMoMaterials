package entity.annotation;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="empno")
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="job")
	private String desg;
	
	@Column(name="mgr")
	private Integer mgr;
	
	@Column(name="hiredate")
	private Date hireDate;
	
	@Column(name = "sal")
	private Double sal;
	
	@Column(name = "comm")
	private Double comm;
	
	@Column(name="deptno")
	private Integer dept;
	
	public Employee() {}

	public Employee(int empId, String empName, String desg, int mgr, Date hireDate, double sal, double comm, int dept) {
		this.empId = empId;
		this.empName = empName;
		this.desg = desg;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
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

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return empId + " " + empName + " " + desg + " " + mgr + " " + hireDate + " " + sal + " " + comm + " " + dept;
	}	
}