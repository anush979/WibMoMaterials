package main;

import beans.demo.*;
import beans.simple.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo05FieldInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config01.xml");
		BeanClassHFieldInjection beanH = (BeanClassHFieldInjection)context.getBean("beanH");
		beanH.display();
	}
}