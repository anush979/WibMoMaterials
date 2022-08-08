package beans.demo;
import beans.simple.*;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component("beanH")
public class BeanClassHFieldInjection {
	@Autowired
	private BeanClassA beanA;
	@Autowired
	private BeanClassB beanB;
	@Autowired
	private BeanClassC beanC;
	@Autowired
	private BeanClassD beanD;
	public void display() {
		System.out.println("***************Field Injection Demo***************");
		beanA.display();
		beanB.display();
		beanC.display();
		beanD.display();
	}
}