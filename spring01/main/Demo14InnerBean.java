package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo14InnerBean {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf14InnerBean.xml");
		BeanClassOOuterBean beanO = (BeanClassOOuterBean)context.getBean("beanO");
		beanO.display();
	}
}
