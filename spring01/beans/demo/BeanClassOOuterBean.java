package beans.demo;

import beans.simple.*;

public class BeanClassOOuterBean {
	private BeanClassA beanAvar;
	private BeanClassB beanBvar;
	public BeanClassA getBeanAvar() {
		return beanAvar;
	}
	public void setBeanAvar(BeanClassA beanAvar) {
		this.beanAvar = beanAvar;
	}
	public BeanClassB getBeanBvar() {
		return beanBvar;
	}
	public void setBeanBvar(BeanClassB beanBvar) {
		this.beanBvar = beanBvar;
	}
	public void display() {
		System.out.println("***************Inner Bean Demo**************");
		System.out.println("BeanClassOOuterBean display()");
		System.out.print("Printing Normal Bean,  Output form  : ");
		beanAvar.display();
		System.out.print("Printing Inner  Bean, Output form : ");
		beanBvar.display();
	}
}