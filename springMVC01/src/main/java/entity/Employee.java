package entity;

import java.sql.Date;

public class Employee {
	private int empId;
	private String empName;
	private String desg;
	private int mgr;
	private int dept;
	private Date hireDate;
	private double sal;
	private double comm;
	public Employee() {}
	public Employee(int empId, String empName, String desg, int mgr, int dept, Date hireDate, double sal, double comm) {
		this.empId = empId;
		this.empName = empName;
		this.desg = desg;
		this.mgr = mgr;
		this.dept = dept;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
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
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
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
	@Override
	public String toString() {
		return empId + " " + empName + " " + desg + " " + hireDate + " " + sal + " " + comm + " " + mgr + " " + dept;
	}	

}
