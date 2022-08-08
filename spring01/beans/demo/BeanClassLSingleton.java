package beans.demo;

import beans.simple.*;

public class BeanClassLSingleton {
	static BeanClassLSingleton beanClassL;
	private BeanClassLSingleton() {}
	public static BeanClassLSingleton getInstance() {
		System.out.println("getInstance()");
		if(beanClassL == null) {
			beanClassL = new BeanClassLSingleton();
		}
		return beanClassL;
	} 
	
	public void display() {
		System.out.println("***************Singleton Class Demo***************");
		System.out.println("BeanClassLSingleton diaplay()");
	}
}
