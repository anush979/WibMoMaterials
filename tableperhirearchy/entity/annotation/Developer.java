package entity.annotation;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("DVP")
public class Developer extends Employee{
	private double dvlpAllowance;
	private String technology;
	private String level;
	public Developer() {}
	public Developer(int empId, String empName, String desg, String dept, String level, String technology, double dvlpAllowance) {
		super(empId, empName, desg, dept);
		this.level = level;
		this.technology = technology;
		this.dvlpAllowance = dvlpAllowance;
	}
	public double getDvlpAllowance() {
		return dvlpAllowance;
	}
	public void setDvlpAllowance(double dvlpAllowance) {
		this.dvlpAllowance = dvlpAllowance;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
