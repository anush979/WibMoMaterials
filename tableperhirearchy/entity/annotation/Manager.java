package entity.annotation;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("MGR")
public class Manager extends Employee {
	private double mgrAllowance;
	private String grade;
	private String experties;
	public Manager() {}
	
	public Manager(int empId, String empName, String desg, String dept, String grade, String experties, double mgrAlowance) {
		super(empId, empName, desg, dept);
		this.grade = grade;
		this.experties = experties;
		this.mgrAllowance = mgrAlowance;
	}

	public double getMgrAllowance() {
		return mgrAllowance;
	}
	public void setMgrAllowance(double mgrAllowance) {
		this.mgrAllowance = mgrAllowance;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getExperties() {
		return experties;
	}
	public void setExperties(String experties) {
		this.experties = experties;
	}
	
}
