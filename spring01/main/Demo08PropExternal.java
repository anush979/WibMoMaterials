package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo08PropExternal {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf08PropExternal.xml");
		System.out.println("Reading Properties Into Bean");
		BeanClassJPropExternal beanJ = (BeanClassJPropExternal)context.getBean("beanJ");
		beanJ.display();
	}
}