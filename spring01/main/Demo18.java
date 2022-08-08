package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.BeanClassA;

public class Demo18 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf18.xml");
		BeanClassA beanA = (BeanClassA)context.getBean("beanB");
		beanA.display();
	}

}
