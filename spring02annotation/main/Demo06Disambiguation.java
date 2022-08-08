package main;

import beans.demo.*;
import beans.simple.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo06Disambiguation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config01.xml");
		BeanClassIDisambiguation beanI = (BeanClassIDisambiguation)context.getBean("beanI");
		beanI.display();
	}
}