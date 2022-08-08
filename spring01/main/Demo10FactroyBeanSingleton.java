package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo10FactroyBeanSingleton {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf10FactoryBeanSingleton.xml");
		//BeanClassLSingleton beanL = (BeanClassLSingleton)context.getBean("beanL");
		//BeanClassA beanA = (BeanClassA)context.getBean("beanM");
		//beanL = new BeanClassLSingleton();
		
		//beanL.display(); 
		//System.out.println("***************FactoryBeanDemo***************");
		//beanA.display();
		

		TestClass tc1 = (TestClass)context.getBean("beanM");
		TestClass tc2 = (TestClass)context.getBean("beanM");
		TestClass tc3 = (TestClass)context.getBean("beanM");
		TestClass tc4 = (TestClass)context.getBean("beanM");
		
		
		tc1.testMethod();
		tc2.testMethod();
		tc3.testMethod();
		tc4.testMethod();

	}
}
