package beans.demo;

import beans.simple.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("beanF")
public class BeanClassFSetterInjection {
	private BeanClassA beanA;
	private BeanClassB beanB;
	private BeanClassC beanC;
	private BeanClassD beanD;
	@Autowired
	public void setBeanA(BeanClassA beanA) {
		this.beanA = beanA;
	}
	@Autowired
	public void setBeanB(BeanClassB beanB) {
		this.beanB = beanB;
	}
	@Autowired
	public void setBeanC(BeanClassC beanC) {
		this.beanC = beanC;
	}
	@Autowired
	public void setBeanD(BeanClassD beanD) {
		this.beanD = beanD;
	}
	public BeanClassA getBeanA() {
		return beanA;
	}
	public BeanClassB getBeanB() {
		return beanB;
	}
	public BeanClassC getBeanC() {
		return beanC;
	}
	public BeanClassD getBeanD() {
		return beanD;
	}
	public void display() {
		System.out.println("***************Setter Injection Demo***************");
		beanA.display();
		beanB.display();
		beanC.display();
		beanD.display();
	}
}