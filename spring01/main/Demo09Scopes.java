package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo09Scopes {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf09scopes.xml");
		System.out.println("***************Bean Scopes Demo***************");
		BeanClassA beanA1 = (BeanClassA)context.getBean("beanA");
		BeanClassA beanA2 = (BeanClassA)context.getBean("beanA");
		BeanClassB beanB1 = (BeanClassB)context.getBean("beanB");
		BeanClassB beanB2 = (BeanClassB)context.getBean("beanB");
		BeanClassC beanC1 = (BeanClassC)context.getBean("beanC");
		BeanClassC beanC2 = (BeanClassC)context.getBean("beanC");

		if(beanA1 == beanA2) {
			System.out.println("beanA1 == beanA2");
		} else {
			System.out.println("beanA1 != beanA2");			
		}

		if(beanB1 == beanB2) {
			System.out.println("beanB1 == beanB2");
		} else {
			System.out.println("beanB1 != beanB2");			
		}

		if(beanC1 == beanC2) {
			System.out.println("beanC1 == beanC2");
		} else {
			System.out.println("beanC1 != beanC2");			
		}

		System.out.println("beanA1 : " + beanA1);
		System.out.println("beanA2 : " + beanA2);
		System.out.println("beanB1 : " + beanB1);
		System.out.println("beanB2 : " + beanB2);
		System.out.println("beanC1 : " + beanC1);
		System.out.println("beanC2 : " + beanC2);

	}
}
