package beans.demo;

import beans.simple.*;

public class BeanClassIPnCNameSpace {
	private BeanClassA beanAvar;
	private BeanClassB beanBvar;
	private BeanClassC beanCvar;
	private BeanClassD beanDvar;
	public BeanClassIPnCNameSpace(BeanClassA beanAvar, BeanClassB beanBvar) {
		this.beanAvar = beanAvar;
		this.beanBvar = beanBvar;
	}
	public BeanClassC getBeanCvar() {
		return beanCvar;
	}
	public void setBeanCvar(BeanClassC beanCvar) {
		this.beanCvar = beanCvar;
	}
	public BeanClassD getBeanDvar() {
		return beanDvar;
	}
	public void setBeanDvar(BeanClassD beanDvar) {
		this.beanDvar = beanDvar;
	}
	public void display() {
		System.out.println("***************P and C NameSpace Demo***************");
		System.out.println("BeanClassIPnCNameSpace display");
		beanAvar.display();
		beanBvar.display();
		beanCvar.display();
		beanDvar.display();
	}
}
