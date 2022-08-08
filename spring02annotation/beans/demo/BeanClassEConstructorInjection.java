package beans.demo;

import beans.simple.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("beanE")
public class BeanClassEConstructorInjection {
	private BeanClassA beanA;
	private BeanClassB beanB;
	private BeanClassC beanC;
	private BeanClassD beanD;
	
	@Autowired
	public BeanClassEConstructorInjection(BeanClassA beanA, BeanClassB beanB, BeanClassC beanC, BeanClassD beanD) {
		super();
		this.beanA = beanA;
		this.beanB = beanB;
		this.beanC = beanC;
		this.beanD = beanD;
	}
	public void display() {
		System.out.println("***************Constructor Injection Demo***************");
		beanA.display();
		beanB.display();
		beanC.display();
		beanD.display();
	}	
}