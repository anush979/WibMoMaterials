package main;

import beans.demo.*;
import beans.simple.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo07Scopes {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config01.xml");
		BeanClassA beanA1 = (BeanClassA)context.getBean("beanA");
		BeanClassA beanA2 = (BeanClassA)context.getBean("beanA");
		BeanClassJScope beanJ1 = (BeanClassJScope)context.getBean("beanJ");
		BeanClassJScope beanJ2 = (BeanClassJScope)context.getBean("beanJ");
		beanA1.display();
		System.out.println("hashCode() : " + beanA1.hashCode());
		beanA2.display();
		System.out.println("hashCode() : " + beanA2.hashCode());
		beanJ1.display();
		beanJ2.display();
		System.out.println("beanA1 == beanA2 : " + (beanA1 == beanA2));
		System.out.println("beanJ1 == beanJ2 : " + (beanJ1 == beanJ2));

	}
}