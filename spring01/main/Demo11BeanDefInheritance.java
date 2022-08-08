package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo11BeanDefInheritance {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf11BeanDefInheritance.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf12BeanDefInheritance.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf13BeanDefInheritance.xml");

		//BeanClassNDataSource abstractPool = (BeanClassNDataSource)context.getBean("abstractPool");		
		//BeanClassNDataSource dbPoolA = (BeanClassNDataSource)context.getBean("poolA");
		BeanClassNDataSource defaultPool = (BeanClassNDataSource)context.getBean("defaultPool");
		BeanClassNDataSource dbPoolB = (BeanClassNDataSource)context.getBean("poolB");
		BeanClassNDataSource dbPoolC = (BeanClassNDataSource)context.getBean("poolC");
		//abstractPool.display();
		defaultPool.display();
		//dbPoolA.display();
		dbPoolB.display();
		dbPoolC.display();
		
	}
}
