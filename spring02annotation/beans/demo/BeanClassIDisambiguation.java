package beans.demo;

import beans.simple.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
@Component("beanI")
public class BeanClassIDisambiguation {
	@Autowired @Qualifier("beanA")
	private BeanClass beanA;
	private BeanClass beanB;
	private BeanClass beanC;
	private BeanClass beanD;
	
	@Autowired
	public BeanClassIDisambiguation(@Qualifier("beanB") BeanClass beanB, @Qualifier("beanC") BeanClass beanC) {
		this.beanB = beanB;
		this.beanC = beanC;
	}
	@Autowired
	public void setBeanD(@Qualifier("beanD") BeanClass beanD) {
		this.beanD = beanD;
	}

	public void setBeanA(BeanClass beanA) {
		this.beanA = beanA;
	}
	public void setBeanB(BeanClass beanB) {
		this.beanB = beanB;
	}
	public void setBeanC(BeanClass beanC) {
		this.beanC = beanC;
	}
	public BeanClass getBeanA() {
		return beanA;
	}
	public BeanClass getBeanB() {
		return beanB;
	}
	public BeanClass getBeanC() {
		return beanC;
	}
	public BeanClass getBeanD() {
		return beanD;
	}
	public void display() {
		System.out.println("***************Disambiguation Demo***************");
		beanA.display();
		beanB.display();
		beanC.display();
		beanD.display();
	}
}