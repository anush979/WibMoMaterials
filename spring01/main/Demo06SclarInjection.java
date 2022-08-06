package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo06SclarInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf06SclarInjection.xml");
		System.out.println("Multiple Parameter Constructor Injection");
		BeanClassHScalerValues beanH = (BeanClassHScalerValues)context.getBean("beanH");
		beanH.display();

	}
}
