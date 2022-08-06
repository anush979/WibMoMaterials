package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo05MultiParamConstInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf05MultiParamConstInjection.xml");
		System.out.println("Multiple Parameter Constructor Injection");
		BeanClassGMultiParamConstInj beanG = (BeanClassGMultiParamConstInj)context.getBean("beanG");
		beanG.display();
	}

}
