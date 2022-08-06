package beans.demo;

import beans.simple.*;

public class BeanClassHScalerValues {
	private String str1;
	private String str2;
	private String str3;
	private int intVal1;
	private int intVal2;
	private double doubleVal1;
	private double doubleVal2;
	private boolean boolVal1;
	private char charVal1;

	public BeanClassHScalerValues(String str1, int intVal1, double doubleVal1, boolean boolVal1, char charVal1) {
		super();
		this.str1 = str1;
		this.intVal1 = intVal1;
		this.doubleVal1 = doubleVal1;
		this.boolVal1 = boolVal1;
		this.charVal1 = charVal1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	public int getIntVal2() {
		return intVal2;
	}
	public void setIntVal2(int intVal2) {
		this.intVal2 = intVal2;
	}
	public double getDoubleVal2() {
		return doubleVal2;
	}
	public void setDoubleVal2(double doubleVal2) {
		this.doubleVal2 = doubleVal2;
	}
	public void display() {
		System.out.println("***************Sclare Value Injection Demo***************");
		System.out.println("BeanClassHScalerValues diaplay()");
		System.out.println("String1 : " + str1);
		System.out.println("String2 : " + str2);
		System.out.println("int     : " + intVal1);
		System.out.println("double  : " + doubleVal1);
		System.out.println("boolean : " + boolVal1);
		System.out.println("char    : " + charVal1);

		System.out.println("String3 : " + str3);
		System.out.println("int     : " + intVal2);
		System.out.println("double  : " + doubleVal2);

	}
	
}
