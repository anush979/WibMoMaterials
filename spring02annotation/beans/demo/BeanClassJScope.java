package beans.demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Component("beanJ")
@Scope("prototype")
@Lazy(false)
public class BeanClassJScope {
	public void display() {
		System.out.println("***************Scope Demo***************");
		System.out.println("BeanClassIScope display()");
		System.out.println("hashcode() : " + hashCode());
	}
}