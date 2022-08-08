package beans.demo;

import beans.simple.*;

public class BeanClassEConstructorInjection {
	private BeanClassA beanAvar;

	public BeanClassEConstructorInjection(BeanClassA beanAvar) {
		super();
		this.beanAvar = beanAvar;
	}
	
	public void display() {
		System.out.println("******************Constructor Injection Demo*************************");
		beanAvar.display();
		System.out.println("BeanClassEConstructorInjection display()");
	}
}
