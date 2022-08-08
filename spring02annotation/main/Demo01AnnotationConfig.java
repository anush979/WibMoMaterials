package main;

import beans.demo.*;
import beans.simple.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01AnnotationConfig {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/application-config01.xml");
		BeanClassA beanA  = (BeanClassA)context.getBean("beanA");
		BeanClassB beanB  = (BeanClassB)context.getBean("beanB");
		BeanClassC beanC  = (BeanClassC)context.getBean("beanC");
		BeanClassD beanD  = (BeanClassD)context.getBean("beanD");
		System.out.println("***************Annotaion Config Demo**************");
		beanA.display();
		beanB.display();
		beanC.display();
		beanD.display();
	}
}