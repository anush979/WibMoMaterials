package beans.demo;

import beans.simple.*;

public class BeanClassGMultiParamConstInj {
	private BeanClassA beanA;
	private BeanClassB beanB;
	public BeanClassGMultiParamConstInj(BeanClassA beanA, BeanClassB beanB) {
		super();
		this.beanA = beanA;
		this.beanB = beanB;
	}
	public void display() {
		System.out.println("***************Multiple Param Constructor injection***************");
		System.out.println("BeanClassGMultiParamConstInj display()");
		beanA.display();
		beanB.display();
	}
}
