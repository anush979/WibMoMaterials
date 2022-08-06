package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo02ConstructorInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/myapp/conf/appconf02ConstructorInjection.xml");
		BeanClassEConstructorInjection beanE = (BeanClassEConstructorInjection)context.getBean("beanE");
		beanE.display();
	}
}
