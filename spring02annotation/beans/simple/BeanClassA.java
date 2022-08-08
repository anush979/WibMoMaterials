package beans.simple;
import org.springframework.stereotype.Component;

@Component("beanA")
public class BeanClassA implements BeanClass {
	public void display() {
		System.out.println("Annotation Demo BeanClassA display()");
	}
}
