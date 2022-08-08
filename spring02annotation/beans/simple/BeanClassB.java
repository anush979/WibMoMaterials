package beans.simple;

import org.springframework.stereotype.Component;

@Component("beanB")
public class BeanClassB implements BeanClass {
	public void display() {
		System.out.println("Annotation Demo BeanClassB display()");
	}
}
