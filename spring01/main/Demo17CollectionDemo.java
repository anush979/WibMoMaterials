package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.simple.*;
import beans.demo.*;

public class Demo17CollectionDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/appconf17CollectionDemo.xml");
		BeanClassQCollectionDemo beanQ = (BeanClassQCollectionDemo)context.getBean("beanQ");
		beanQ.display();
	}
}
