package beans.simple;

import org.springframework.stereotype.Component;

@Component("beanC")
public class BeanClassC implements BeanClass {
	public void display() {
		System.out.println("Annotation Demo BeanClassC display()");
	}
}
