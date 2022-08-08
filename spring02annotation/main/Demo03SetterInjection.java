package main;

import beans.demo.*;
import beans.simple.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo03SetterInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config01.xml");
		BeanClassFSetterInjection beanF = (BeanClassFSetterInjection)context.getBean("beanF");
		beanF.display();
	}
}