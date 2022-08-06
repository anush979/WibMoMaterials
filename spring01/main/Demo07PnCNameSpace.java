package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo07PnCNameSpace {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf07PnCNameSpace.xml");
		System.out.println("C and P Name Space Demo");
		BeanClassIPnCNameSpace beanI = (BeanClassIPnCNameSpace)context.getBean("beanI");
		beanI.display();
	}
}
