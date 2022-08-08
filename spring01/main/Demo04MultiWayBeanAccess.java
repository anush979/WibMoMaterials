package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo04MultiWayBeanAccess {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf04MultiWayBeanAccess.xml");
		System.out.println("Accessing Bean, Multiple Ways");
		//BeanClassA beanA = (BeanClassA)context.getBean("beanA");
		//BeanClassA beanA = context.getBean("beanA", BeanClassA.class);
		//BeanClassA beanA = context.getBean(BeanClassA.class, "beanA");
		BeanClassA beanA = context.getBean(BeanClassA.class);

		beanA.display();
	}

}
