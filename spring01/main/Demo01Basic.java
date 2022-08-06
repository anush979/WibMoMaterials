package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;

public class Demo01Basic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf01basic.xml");
		BeanClassA beanA = (BeanClassA)context.getBean("beanA");
		beanA.display();
	}

}
