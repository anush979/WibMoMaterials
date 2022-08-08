package beans.demo;

import beans.simple.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component("beanG")
public class BeanClassGOptionalInjection {
	private BeanClassA beanA;
	private BeanClassB beanB;
	private BeanClassC beanC;
	private BeanClassD beanD;
	private BeanClassOptional beanOptional;
	public void display() {
		System.out.println("***************Optional Injection Demo***************");
		beanA.display();
		beanB.display();
		beanC.display();
		beanD.display();			
		if(beanOptional != null) {
			beanOptional.display();
		}
	}
	//@Autowired
	@Autowired(required = false)	
	public void setBeanOptional(BeanClassOptional beanOptional) {
		this.beanOptional = beanOptional;
	}
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
	public BeanClassOptional getBeanOptional() {
		return beanOptional;
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
}