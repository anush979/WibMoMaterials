package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo15NestedInnerBeans {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf15NestedInnerBeans.xml");
		BeanClassPNestedBean beanP = (BeanClassPNestedBean)context.getBean("beanP");
		beanP.display();
	}

}
