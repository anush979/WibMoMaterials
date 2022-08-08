package beans.demo;

import beans.simple.*;

public class BeanClassPNestedBean {
	private BeanClassOOuterBean beanO;

	public BeanClassPNestedBean(BeanClassOOuterBean beanO) {
		super();
		this.beanO = beanO;
	}
	
	public void display() {
		System.out.println("**************Nested Bean Demo***************");
		System.out.println("BeanClassPNestedBean display()");
		beanO.display();
	}
}
