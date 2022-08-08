package beans.simple;

import org.springframework.stereotype.Component;

@Component("beanD")
public class BeanClassD implements BeanClass {
	public void display() {
		System.out.println("Annotation Demo BeanClassD display()");
	}
}
