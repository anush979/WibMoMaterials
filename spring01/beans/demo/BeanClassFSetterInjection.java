package beans.demo;

import beans.simple.*;

public class BeanClassFSetterInjection {
	BeanClassA beanAvar;
	public BeanClassA getBeanAvar() {
		return beanAvar;
	}
	public void setBeanAvar(BeanClassA beanAvar) {
		this.beanAvar = beanAvar;
	}
	public void display() {
		System.out.println("******************Setter Injection Demo*************************");
		beanAvar.display();
		System.out.println("BeanClassFSetterInjection display()");
	}
}
